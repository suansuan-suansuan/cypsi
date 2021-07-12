package com.cy.psi.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.cy.psi.entity.*;
import com.cy.psi.service.*;
import com.cy.psi.vo.AjaxResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * 表控制层
 * @author
 */
@RestController
@RequestMapping("CapitalReceipt")
public class CapitalReceiptController {
    @Resource
    private CapitalReceiptService capitalReceiptService;
    @Resource
    private CapitalReceiptBillService capitalReceiptBillService;
    @Resource
    private CapitalReceiptAccountService CapitalReceiptAccountService;
    @Resource
    private CapitalReceivableService capitalReceivableService;
    @Resource
    private SaleOrderService saleOrderService;
    @Resource
    private SysUserService sysUserService;
    @Resource
    private BaseCapitalAccountService baseCapitalAccountService;
    /**
     * 新增收款单
     * @param type
     * @param add
     * @return
     */
    @PostMapping("/addreceipt/{type}")
    public AjaxResponse addreceipt(@PathVariable("type") int type, @RequestBody String add) {
        JSONObject jsonObject = JSONObject.parseObject(add);
        String one = jsonObject.getString("receipt");
        CapitalReceipt receipt = JSON.parseObject(one, CapitalReceipt.class);
        String two = jsonObject.getString("bill");
        CapitalReceiptBill bills= JSON.parseObject(two, CapitalReceiptBill.class);
        String three = jsonObject.getString("account");
        CapitalReceiptAccount accounts= JSON.parseObject(three, CapitalReceiptAccount.class);
            receipt.setApprovalState(type);
            receipt.setFoundTime(new Date());
            capitalReceiptService.insert(receipt);


        //绑定收款单
        bills.setCapitalReceiptId(receipt.getCapitalReceiptId());
        accounts.setCapitalReceiptId(receipt.getCapitalReceiptId());
        capitalReceiptBillService.insert(bills);
        CapitalReceiptAccountService.insert(accounts);
        return AjaxResponse.success(receipt.getCapitalReceiptId());
    }
    /**
     * 修改订单审批状态
     * @param orderid 主键
     * @return 数据
     */
    @GetMapping("/approval")
    public AjaxResponse approvalorder(String orderid,int type,String user,String approvalremarks){
        //判断订单收款金额是否能够通过审批
        if(type == 1){
            CapitalReceipt receipt=capitalReceiptService.queryById(orderid);
            List<CapitalReceiptBill> bills=capitalReceiptBillService.queryById(receipt.getCapitalReceiptId());
            for (int i=0;i<bills.size();i++) {
                if (bills.get(i).getSettlementType().equals("销售出库单")||bills.get(i).getSettlementType().equals("销售退货单")) {
                    CapitalReceivable ok=capitalReceivableService.queryById(bills.get(i).getSaleOrderId());
                    if(ok.getCaseState()==1){
                        return AjaxResponse.success("订单："+ok.getDeliveryId()+"已结案");
                    }
                }else if (bills.get(i).getSettlementType().equals("销售订单")){
                    SaleOrder ok=saleOrderService.queryById(bills.get(i).getSaleOrderId());
                    if (Double.parseDouble(ok.getAdvance()+(bills.get(i)).getThisMoney())>ok.getReceivables()){
                        return AjaxResponse.success("订单："+ok.getSaleOrderId()+"预收款金额不足");
                    }
                }
            }
        }
        //修改收款单信息
        CapitalReceipt receipt=new CapitalReceipt();
        receipt.setCapitalReceiptId(orderid);
        receipt.setApprovalState(type);
        receipt.setApprover(sysUserService.queryUserIdByUserName(user));
        receipt.setRemarks(approvalremarks);
        receipt.setApprovalTime(new Date());
        receipt.setUpdateTime(new Date());
        capitalReceiptService.update(receipt);
        if(type == 1){
            //订单通过修改单据已收款
            CapitalReceivable receivable=new CapitalReceivable();
            List<CapitalReceiptBill> bills=capitalReceiptBillService.queryById(receipt.getCapitalReceiptId());
            for (int i=0;i<bills.size();i++) {
                //修改单据收款金额
                SaleOrder order=new SaleOrder();
                if (bills.get(i).getSettlementType().equals("销售出库单")||bills.get(i).getSettlementType().equals("销售退货单")) {
                    //修改应收款信息
                    receivable.setDeliveryId(bills.get(i).getSaleOrderId());
                    receivable.setLastCollectionTime(new Date());
                    receivable.setReceiptRemark(approvalremarks);
                    receivable.setReceived(Double.parseDouble(bills.get(i).getThisMoney()));
                    CapitalReceivable tf=capitalReceivableService.receivedAdd(receivable);
                    if(tf.getUncollected()==0){
                        tf.setCaseState(1);
                        capitalReceivableService.update(tf);
                    }
                }
                if (bills.get(i).getSettlementType().equals("销售订单")) {
                    //修改订单已收款信息
                    order.setSaleOrderId(bills.get(i).getSaleOrderId());
                    order.setUpdateTime(new Date());
                    order.setAdvance(Double.parseDouble(bills.get(i).getThisMoney()));
                    saleOrderService.advanceadd(order);
                }
            }
            //订单通过增加账户资金
            BaseCapitalAccount baseaccount=new BaseCapitalAccount();
            List<CapitalReceiptAccount> accounts=CapitalReceiptAccountService.queryById(receipt.getCapitalReceiptId());
            for (int j=0;j<accounts.size();j++) {
                baseaccount.setFundAccount(accounts.get(j).getFundAccount());
                baseaccount.setCurrentAmount(Double.parseDouble(accounts.get(j).getThisMoney()));
                baseCapitalAccountService.currentAmountadd(baseaccount);
            }
        }
        return AjaxResponse.success(true);
    }
}
