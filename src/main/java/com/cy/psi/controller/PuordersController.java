package com.cy.psi.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.cy.psi.entity.CypsiPuorder;
import com.cy.psi.entity.Puorders;
import com.cy.psi.entity.SaleOrder;
import com.cy.psi.entity.SaleOrderDetails;
import com.cy.psi.service.*;
import com.cy.psi.vo.AjaxResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("POcha")
@CrossOrigin
public class PuordersController {
    @Resource
    private PuordersSerice puordersSerice;
    @Autowired
    private InventoryService inventoryService;
    @Resource
    private PuorderSerice puorderSerice;
    @Resource
    private SysUserService sysUserService;
    @Resource
    private BaseProductService baseProductService;

    @RequestMapping("/adds")
    public AjaxResponse adds( @RequestBody String adds){
        //获取json对象
        JSONObject jsonObject = JSONObject.parseObject(adds);
        String one = jsonObject.getString("order");
        System.out.println("one:"+one);
        //订单
        CypsiPuorder saleOrder = JSON.parseObject(one, CypsiPuorder.class);
        System.out.println("saleOrder:"+saleOrder);

        String two = jsonObject.getString("orderdetails");
        //单据详情
        List<Puorders> orderdetails= JSONArray.parseArray(two, Puorders.class);
        //订单详情绑定订单id
        for(int i=0;i<orderdetails.size();i++){
            orderdetails.get(i).setPuorderId(saleOrder.getPuorderState());
        }
        puorderSerice.insertPuS(saleOrder);

        puordersSerice.insertb(orderdetails);

        return AjaxResponse.success(saleOrder.getPuorderId());
    }
}
