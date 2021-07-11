package com.cy.psi.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.cy.psi.entity.SaleOrder;
import com.cy.psi.entity.SaleOrderDetails;
import com.cy.psi.service.InventoryService;
import com.cy.psi.service.SaleOrderDetailsService;
import com.cy.psi.service.SaleOrderService;
import com.cy.psi.vo.AjaxResponse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author 酸酸
 */
@RestController
@RequestMapping("SaleOrder")
public class SaleOrderController {
    @Resource
    private SaleOrderDetailsService saleOrderDetailsService;
    @Resource
    private InventoryService inventoryService;
    @Resource
    private SaleOrderService saleOrderService;
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
    }
        //添加订单信息
        saleOrder.setFoundTime(new Date());
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
            inventoryService.expectReduce(sod.getProductId(),sod.getDepot(),sod.getProductNum());
        }
    }
    return AjaxResponse.success(saleOrder.getSaleOrderId());
}

}
