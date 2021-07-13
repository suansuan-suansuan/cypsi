package com.cy.psi.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.cy.psi.entity.*;
import com.cy.psi.service.*;
import com.cy.psi.vo.AjaxResponse;
import com.cy.psi.vo.SaleDeliveryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author
 */
@RestController
@RequestMapping("saledelivery")
@CrossOrigin
public class SaleDeliveryController {
    @Resource
    private SaleDeliveryService saledeliveryService;
    @Resource
    private SaleDeliveryDetailsService saleDeliveryDetailsService;
    @Resource
    private SysUserService sysUserService;
    @Resource
    private SaleOrderService saleOrderService;
    @Autowired
    private InventoryService inventoryService;
    @Resource
    private CapitalReceivableService capitalReceivableService;
    @Resource
    private SaleOrderDetailsService saleOrderDetailsService;

    /**
     * 通过主键查询销售出库单及出库单详情
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/find/{id}")
    public AjaxResponse selectOne(@PathVariable("id") String id) {
        SaleDelivery delivery = saledeliveryService.queryByIdVo(id);
        List<SaleDeliveryDetails> deliveryDetails = saleDeliveryDetailsService.queryById(id);
        SaleDeliveryVo vo = new SaleDeliveryVo();
        if (delivery.getApprover() != null) {
            delivery.setApprover(sysUserService.queryById(delivery.getApprover()).getUName());
        }
        delivery.setSalesmen(sysUserService.queryById(delivery.getSalesmen()).getUName());
        vo.setDelivery(delivery);
        vo.setDeliverydetails(deliveryDetails);
        return AjaxResponse.success(vo);
    }
    /**
     *
     */
    @GetMapping("/findall")
    public AjaxResponse findall(String id){
        System.out.println("s：：：：：："+saleOrderDetailsService.queryByorderId(id));
        return  AjaxResponse.success(saleOrderDetailsService.queryByorderId(id));
    }
    /**
     * 新增销售出库单
     *
     * @param add  单据信息
     * @param type 是否为草稿
     * @return 订单id
     */
    @PostMapping("/add/{type}")
    public AjaxResponse add(@PathVariable("type") int type, @RequestBody String add) {
        JSONObject jsonObject = JSONObject.parseObject(add);
        String one = jsonObject.getString("delivery");
        SaleDelivery delivery = JSON.parseObject(one, SaleDelivery.class);
        String two = jsonObject.getString("deliverydetails");
        List<SaleDeliveryDetails> deliverydetails = JSONArray.parseArray(two, SaleDeliveryDetails.class);
        //添加销售出库单信息
        for (int i = 0; i < deliverydetails.size(); i++) {
            deliverydetails.get(i).setDeliveryOrderId(delivery.getDeliveryOrderId());
        }

        //添加订单信息
        delivery.setFoundTime(new Date());
        delivery.setOrderState(0);
        delivery.setDeliveryState(0);
        //订单状态
        delivery.setApprovalState(type);
        delivery.setUpdateTime(new Date());
        delivery.setApprovalTime(new Date());
        saledeliveryService.insert(delivery);
        if (type == 0) {
//            //如果存在销售订单，修改订单状态--绑定出库单
//            if (delivery.getSaleOrderId() != null) {
//                SaleOrder saleOrder = new SaleOrder();
//                saleOrder.setUpdateTime(new Date());
//                saleOrder.setSaleOrderId(delivery.getSaleOrderId());
//                saleOrderService.update(saleOrder);
//            }
            System.out.println("水水水水"+deliverydetails);
            saleDeliveryDetailsService.insertBatch(deliverydetails);
            //出库单生成减去预计库存数量--关联订单为空状态下
            if (type == 0 && delivery.getSaleOrderId() == null) {
                List<SaleDeliveryDetails> deliveryDetails = saleDeliveryDetailsService.queryById(delivery.getDeliveryOrderId());
                for (SaleDeliveryDetails sdd : deliveryDetails) {
                    inventoryService.expectReduce(sdd.getProductId(), sdd.getDepotId(), sdd.getProductNum());
                }
            }

        }
        return AjaxResponse.success(delivery.getDeliveryOrderId());
    }
    /**
     * 修改销售出库单审批状态
     * @param orderid 主键
     * @return 数据
     */
    @GetMapping("/approval")
    public AjaxResponse approvalorder(String orderid,int type,String username,String approvalremarks){
        SaleDelivery saleDelivery=new SaleDelivery();
        saleDelivery.setDeliveryOrderId(orderid);
        saleDelivery.setApprovalState(type);
        saleDelivery.setApprover(sysUserService.queryUserIdByUserName(username));
        saleDelivery.setRemarks(approvalremarks);
        saleDelivery.setApprovalTime(new Date());
        saleDelivery.setUpdateTime(new Date());
        //订单驳回修改预计库存
        if(type == -1){
            saleDelivery.setUpdateTime(new Date());
            List<SaleDeliveryDetails> deliveryDetails=saleDeliveryDetailsService.queryById(orderid);
            for(SaleDeliveryDetails sdd:deliveryDetails){
                inventoryService.expectAdd(sdd.getProductId(),sdd.getDepotId(),sdd.getProductNum());
            }
        }
        if(type == 1){
            saleDelivery.setDeliveryState(1);
        }
        SaleDelivery saleDeliverys=saledeliveryService.update(saleDelivery);
        //审批通过产品出库减去当前库存数量
        if(type == 1) {
            List<SaleDeliveryDetails> deliveryDetails=saleDeliveryDetailsService.queryById(orderid);
            for(SaleDeliveryDetails sdd:deliveryDetails){
                inventoryService.expectReduce(sdd.getProductId(),sdd.getDepotId(),sdd.getProductNum());
            }
            //新增应收单据
            CapitalReceivable receivable=new CapitalReceivable();
            receivable.setDeliveryId(saleDeliverys.getDeliveryOrderId());
            receivable.setDeliveryTime(saleDeliverys.getDeliveryOrderTime());
            receivable.setCustomer(saleDeliverys.getCustomer());
            receivable.setSalesmen(saleDeliverys.getSalesmen());
            receivable.setReceivables(saleDeliverys.getReceivables());
            receivable.setReceived(0.00);
            receivable.setUncollected(saleDeliverys.getReceivables());
            receivable.setRemarks(saleDeliverys.getRemarks());
            receivable.setCaseState(0);
            capitalReceivableService.insert(receivable);
        }
        //如果绑定了订单就修改订单为已出库
        if (type == 1 && saleDeliverys.getSaleOrderId()!=null){
            SaleOrder order=new SaleOrder();
            order.setSaleOrderId(saleDelivery.getSaleOrderId());
            order.setUpdateTime(new Date());
            order.setDeliveryState(1);
            //order.setOrderState(1);
            saleOrderService.update(order);
        }
        return AjaxResponse.success(saleDelivery);
    }
}
