package com.cy.psi.controller;

import com.cy.psi.service.Impl.SaleDeliveServiceImpl;
import com.cy.psi.service.InventoryService;
import com.cy.psi.service.SaleDeliveService;
import com.cy.psi.vo.AjaxResponse;
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

    /**
     * 查找商品销售明细
     * @return
     */
    @PostMapping("/listSales")
    public AjaxResponse listSales(@RequestBody Map map) {
        String s = (String) map.get("startTime");
        String s1 = (String) map.get("endTime");
        if (!StringUtils.isEmpty(s) && !StringUtils.isEmpty(s1)){
            String startTime = s.substring(0,10);
            map.put("startTime",startTime);
            String endTime = s1.substring(0,10);
            map.put("endTime",endTime);
        }
        List<Map<String, Object>> maps = saleDeliveService.listStatistical(map);
        return AjaxResponse.success(maps);
    }

    /**
     * 商品销售订单明细
     * @param map
     * @return
     */
    @PostMapping("/listSalesOrder")
    public AjaxResponse listSalesOrder(@RequestBody Map map) {
        String s = (String) map.get("startTime");
        String s1 = (String) map.get("endTime");
        if (!StringUtils.isEmpty(s) && !StringUtils.isEmpty(s1)){
            String startTime = s.substring(0,10);
            map.put("startTime",startTime);
            String endTime = s1.substring(0,10);
            map.put("endTime",endTime);
        }
        List<Map<String, Object>> maps = saleDeliveService.listStatisticalOrder(map);
        return AjaxResponse.success(maps);
    }

    /**
     * 前十畅销的商品
     * @return
     */
    @GetMapping("/listSalesProduct")
    public AjaxResponse listSalesProduct() {
        List<Map<String, Object>> maps = saleDeliveService.listStatisticalProduct();
        return AjaxResponse.success(maps);
    }


    /**
     *销售毛利明细
     * @param map
     * @return
     */
    @PostMapping("/listSalesGross")
    public AjaxResponse listSalesGross(@RequestBody Map map){
        List<Map<String, Object>> maps = saleDeliveService.listSalesGross(map);
        return AjaxResponse.success(maps);
    }

    /**
     * 库存明细
     * @param map
     * @return
     */
    @PostMapping("/listProduct")
     public AjaxResponse listProduct(@RequestBody Map map){
        List<Map<String, Object>> maps = inventoryService.listProduct(map);
        return AjaxResponse.success(maps);
    }
}
