package com.cy.psi.service;

import com.cy.psi.entity.SaleOrder;

/**
 * @author 酸酸
 */
public interface SaleOrderService {
    /**
     * 修改订单
     * @param saleOrder
     */
    void update(SaleOrder saleOrder);

    /**
     * 新增订单
     * @param saleOrder
     */
    void insert(SaleOrder saleOrder);
}
