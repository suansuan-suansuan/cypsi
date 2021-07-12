package com.cy.psi.service;

import com.cy.psi.entity.SaleDelivery;

/**
 * @author 酸酸
 */
public interface SaleDeliveryService {
    /**
     * s
     * @param id
     * @return
     */
    SaleDelivery queryByIdVo(String id);

    /**
     * s
     * @param delivery
     */
    void insert(SaleDelivery delivery);

    /**
     * s
     * @param saleDelivery
     * @return
     */
    SaleDelivery update(SaleDelivery saleDelivery);
}
