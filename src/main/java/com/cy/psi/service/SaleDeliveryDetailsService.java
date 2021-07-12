package com.cy.psi.service;

import com.cy.psi.entity.SaleDeliveryDetails;

import java.util.List;

/**
 * @author
 */
public interface SaleDeliveryDetailsService {
    /**
     *
     * @param id
     * @return
     */
    List<SaleDeliveryDetails> queryById(String id);

    /**
     * s
     * @param deliverydetails
     */
    void insertBatch(List<SaleDeliveryDetails> deliverydetails);
}
