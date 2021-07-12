package com.cy.psi.service;

import com.cy.psi.entity.SaleOrder;

/**
 * @author 酸酸
 */
public interface SaleOrderService {
    /**
     * 修改订单
     * @param saleOrder
     * @return SaleOrder
     */
    SaleOrder update(SaleOrder saleOrder);

    /**
     * 新增订单
     * @param saleOrder
     */
    void insert(SaleOrder saleOrder);

    /**
     * 通过销售订单号查询
     * @param id
     * @return
     */
    SaleOrder queryById(String id);

    void advanceadd(SaleOrder order);
}
