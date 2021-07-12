package com.cy.psi.service;

import java.util.List;
import java.util.Map;

/**
 * @author dfy
 * @date 2021/7/12 8:32
 */
public interface SaleDeliveService {

    /**
     *查询销售商品明细
     * @return
     */
    List<Map<String, Object>> listStatistical(Map map);
    /**
     *查询销售订单明细
     * @return
     */
    List<Map<String,Object>> listStatisticalOrder(Map map);

    /**
     *查询前十畅销商品
     * @return
     */
    List<Map<String,Object>> listStatisticalProduct();


    /**
     *销售毛利明细
     * @return
     */
    List<Map<String,Object>> listSalesGross(Map map);

}
