package com.cy.psi.service;

import com.cy.psi.entity.CapitalReceiptAccount;

import java.util.List;

/**
 * @author 
 */
public interface CapitalReceiptAccountService {

    void insert(CapitalReceiptAccount accounts);

    List<CapitalReceiptAccount> queryById(String capitalReceiptId);
}
