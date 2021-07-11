package com.cy.psi.service;

import com.cy.psi.entity.SaleOrderDetails;

import java.util.List;

/**
 * @author 酸酸
 */
public interface SaleOrderDetailsService {
    /**
     *通过订单ID查询单条数据
     * @param saleOrderId
     * @return
     */
    List<SaleOrderDetails> queryById(String saleOrderId);

    /**
     *通过销售订单号删除详情表
     * @param saleOrderId
     */
    void deleteById(String saleOrderId);

    /**
     *新增多条数据
     * @param orderdetails
     */
    void insertBatch(List<SaleOrderDetails> orderdetails);
}
