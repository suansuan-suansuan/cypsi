package com.cy.psi.service;

import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

/**
 * @author dfy
 * @date 2021/7/12 8:32
 */
public interface SaleDeliveService {

    /**
     *查询销售商品明细
     * @param map
     * @return
     */
    PageInfo<Map<String, Object>> findStatistical(Map map);

    /**
     * 查询销售订单明细
     * @param map
     * @return
     */
    PageInfo<Map<String,Object>> findStatisticalOrder(Map map);



    /**
     *销售毛利明细
     * @return
     */
    PageInfo<Map<String,Object>> findSalesGross(Map map);


    /**
     * 查询收付款
     * @return
     */
    List<Map<String,Object>> findCollectionAndPayment();
}
