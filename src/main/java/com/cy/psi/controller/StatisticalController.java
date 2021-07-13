package com.cy.psi.controller;

import com.cy.psi.service.Impl.SaleDeliveServiceImpl;
import com.cy.psi.service.InventoryService;
import com.cy.psi.service.PuorderSerice;
import com.cy.psi.service.SaleDeliveService;
import com.cy.psi.vo.AjaxResponse;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author dfy
 * @date 2021/7/11 21:46
 */
@RestController
@RequestMapping("/sel")
@CrossOrigin
public class StatisticalController {

    @Autowired
    SaleDeliveService saleDeliveService;

    @Autowired
    InventoryService inventoryService;

    @Autowired
    PuorderSerice puorderSerice;

    /**
     * 查找商品销售明细
     *
     * @return
     */
    @PostMapping("/listSales")
    public AjaxResponse listSales(@RequestBody Map map) {
        String s = (String) map.get("startTime");
        String s1 = (String) map.get("endTime");
        if (!StringUtils.isEmpty(s) && !StringUtils.isEmpty(s1)) {
            String startTime = s.substring(0, 10);
            map.put("startTime", startTime);
            String endTime = s1.substring(0, 10);
            map.put("endTime", endTime);
        }
        PageInfo<Map<String, Object>> maps = saleDeliveService.listStatistical(map);
        return AjaxResponse.success(maps);
    }

    /**
     * 商品销售订单明细
     *
     * @param map
     * @return
     */
    @PostMapping("/listSalesOrder")
    public AjaxResponse listSalesOrder(@RequestBody Map map) {
        String s = (String) map.get("startTime");
        String s1 = (String) map.get("endTime");
        if (!StringUtils.isEmpty(s) && !StringUtils.isEmpty(s1)) {
            String startTime = s.substring(0, 10);
            map.put("startTime", startTime);
            String endTime = s1.substring(0, 10);
            map.put("endTime", endTime);
        }
        PageInfo<Map<String, Object>> maps = saleDeliveService.listStatisticalOrder(map);
        return AjaxResponse.success(maps);
    }


    /**
     * 销售毛利明细
     *
     * @param map
     * @return
     */
    @PostMapping("/listSalesGross")
    public AjaxResponse listSalesGross(@RequestBody Map map) {
        PageInfo<Map<String, Object>> maps = saleDeliveService.listSalesGross(map);
        return AjaxResponse.success(maps);
    }

    /**
     * 库存明细
     *
     * @param map
     * @return
     */
    @PostMapping("/listProduct")
    public AjaxResponse listProduct(@RequestBody Map map) {
        PageInfo<Map<String, Object>> maps = inventoryService.listProduct(map);
        return AjaxResponse.success(maps);
    }

    /**
     * 查询过期商品
     *
     * @param map
     * @return
     */
    @PostMapping("/goodsOut")
    public AjaxResponse listGoodOut(@RequestBody Map map) {
        PageInfo<Map<String, Object>> goodOut = inventoryService.findGoodOut(map);
        return AjaxResponse.success(goodOut);
    }

    /**
     * 库存商品预警
     *
     * @param map
     * @return
     */
    @PostMapping("/findInventoryAlarm")
    public AjaxResponse findInventoryAlarm(@RequestBody Map map) {
        PageInfo<Map<String, Object>> inventoryAlarm = inventoryService.findInventoryAlarm(map);
        return AjaxResponse.success(inventoryAlarm);
    }

    /**
     * 查询供应商供货明细
     * @param map
     * @return
     */
    @PostMapping("/puorderSerice")
    public AjaxResponse puorderSerice(@RequestBody Map map) {
        String s = (String) map.get("startTime");
        String s1 = (String) map.get("endTime");
        if (!StringUtils.isEmpty(s) && !StringUtils.isEmpty(s1)) {
            String startTime = s.substring(0, 10);
            map.put("startTime", startTime);
            String endTime = s1.substring(0, 10);
            map.put("endTime", endTime);
        }
        PageInfo<Map<String, Object>> supplierSupply = puorderSerice.findSupplierSupply(map);
        return AjaxResponse.success(supplierSupply);
    }

    /**
     * 查询采购订单明细
     * @param map
     * @return
     */
    @PostMapping("/PurchaseOrder")
    public AjaxResponse PurchaseOrder(@RequestBody Map map) {
        String s = (String) map.get("startTime");
        String s1 = (String) map.get("endTime");
        if (!StringUtils.isEmpty(s) && !StringUtils.isEmpty(s1)) {
            String startTime = s.substring(0, 10);
            map.put("startTime", startTime);
            String endTime = s1.substring(0, 10);
            map.put("endTime", endTime);
        }
        PageInfo<Map<String, Object>> supplierSupply = puorderSerice.PurchaseOrder(map);
        return AjaxResponse.success(supplierSupply);
    }
}
