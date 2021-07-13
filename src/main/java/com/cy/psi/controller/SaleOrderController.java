package com.cy.psi.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.cy.psi.entity.BaseProduct;
import com.cy.psi.entity.SaleOrder;
import com.cy.psi.entity.SaleOrderDetails;
import com.cy.psi.service.*;
import com.cy.psi.vo.AjaxResponse;
import com.cy.psi.vo.BaseProductVo;
import com.cy.psi.vo.SaleOrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONStringer;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.sql.SQLOutput;
import java.util.Date;
import java.util.List;

/**
 * @author 酸酸
 */
@RestController
@RequestMapping("SaleOrder")
@CrossOrigin
public class SaleOrderController {
    @Resource
    private SaleOrderDetailsService saleOrderDetailsService;
    @Autowired
    private InventoryService inventoryService;
    @Resource
    private SaleOrderService saleOrderService;
    @Resource
    private SysUserService sysUserService;
    @Resource
    private BaseProductService baseProductService;

    /**
 * 新增销售订单
 * @param add 单据信息
 * @param type 是否为草稿
 * @return 订单id
 */
@RequestMapping("/add/{type}")
public AjaxResponse add(@PathVariable("type") int type, @RequestBody String add){
    //获取json对象
    JSONObject jsonObject = JSONObject.parseObject(add);
    String one = jsonObject.getString("order");
    //订单
    SaleOrder saleOrder = JSON.parseObject(one, SaleOrder.class);
    String two = jsonObject.getString("orderdetails");
    //单据详情
    List<SaleOrderDetails> orderdetails= JSONArray.parseArray(two, SaleOrderDetails.class);
    //订单详情绑定订单id
    for(int i=0;i<orderdetails.size();i++){
        orderdetails.get(i).setSaleOrderId(saleOrder.getSaleOrderId());
        orderdetails.get(i).setSaleUnitPrice(orderdetails.get(i).getSaleMoney()/orderdetails.get(i).getProductNum());
    }
        //添加订单信息
        saleOrder.setFoundTime(new Date());
        saleOrder.setUpdateTime(new Date());
        saleOrder.setOrderState(0);
        saleOrder.setDeliveryState(0);
        saleOrder.setAdvance(0.00);
        //订单状态
        saleOrder.setApprovalState(type);
        saleOrderService.insert(saleOrder);

    saleOrderDetailsService.insertBatch(orderdetails);
    //订单生成减去库存数量
    if(type == 0) {
        List<SaleOrderDetails> orderDetails=saleOrderDetailsService.queryById(saleOrder.getSaleOrderId());
        for(SaleOrderDetails sod:orderDetails){
            inventoryService.expectReduce(sod.getProductId(),sod.getDepotId(),sod.getProductNum());
        }
    }
    return AjaxResponse.success(saleOrder.getSaleOrderId());
}
    /**
     * 通过主键查询销售订单及销售订单详情
     * @param id 主键
     * @return 数据
     */
    @GetMapping("/find/{id}")
    public AjaxResponse selectOne(@PathVariable("id") String id) {
        SaleOrder order=saleOrderService.queryById(id);
        List<SaleOrderDetails> orderDetails=saleOrderDetailsService.queryById(id);
        SaleOrderVo vo=new SaleOrderVo();
        if(order.getApprover()!=null) {
            order.setApprover(sysUserService.queryById(order.getApprover()).getUName());
        }
        order.setSalesmen(sysUserService.queryById(order.getSalesmen()).getUName());
        vo.setOrder(order);
        vo.setOrderdetails(orderDetails);
        return AjaxResponse.success(vo);
    }
    /**
     * 修改销售订单审批状态
     * @param orderid 主键
     * @return 数据
     */
    @GetMapping("/approval")
    public AjaxResponse approvalorder(String orderid,int type,String username,String approvalremarks){
        SaleOrder order=new SaleOrder();
        order.setSaleOrderId(orderid);
        order.setApprovalState(type);
        order.setApprover(sysUserService.queryUserIdByUserName(username));
        order.setRemarks(approvalremarks);
        order.setApprovalTime(new Date());
        order.setUpdateTime(new Date());
        //订单驳回修改库存
        if(type == -1){
            List<SaleOrderDetails> orderDetails=saleOrderDetailsService.queryById(order.getSaleOrderId());
            for(SaleOrderDetails sod:orderDetails){
                inventoryService.expectAdd(sod.getProductId(),sod.getDepotId(),sod.getProductNum());
            }
        }
        SaleOrder saleOrder=saleOrderService.update(order);
        return AjaxResponse.success(saleOrder);
    }
    @GetMapping("getproduct")
    public AjaxResponse getProduct(){
    return AjaxResponse.success(baseProductService.queryAllProduct());
    }
}
