package com.cy.psi.service;

import com.cy.psi.entity.CapitalReceipt;

/**
 * @author 
 */
public interface CapitalReceiptService {
    /**
     * 新增收款单
     * @param receipt
     * @return
     */
    CapitalReceipt insert(CapitalReceipt receipt);

    CapitalReceipt queryById(String orderid);

    void update(CapitalReceipt receipt);
}
