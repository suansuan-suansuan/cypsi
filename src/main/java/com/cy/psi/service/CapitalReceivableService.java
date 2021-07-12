package com.cy.psi.service;

import com.cy.psi.entity.CapitalReceivable;

/**
 * @author 
 */
public interface CapitalReceivableService {
    void insert(CapitalReceivable receivable);

    CapitalReceivable queryById(String saleOrderId);

    CapitalReceivable receivedAdd(CapitalReceivable receivable);

    void update(CapitalReceivable tf);
}
