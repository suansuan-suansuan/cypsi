package com.cy.psi.service.Impl;

import com.cy.psi.dao.CapitalReceiptAccountDao;
import com.cy.psi.entity.CapitalReceiptAccount;
import com.cy.psi.service.CapitalReceiptAccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author
 */
@Service("CapitalReceiptAccountService")
public class CapitalReceiptAccountServiceImpl implements CapitalReceiptAccountService {
    @Resource
    private CapitalReceiptAccountDao capitalReceiptAccountDao;
    @Override
    public void insert(CapitalReceiptAccount accounts) {
        this.capitalReceiptAccountDao.insert(accounts);
    }

    @Override
    public List<CapitalReceiptAccount> queryById(String capitalReceiptId) {
        return this.capitalReceiptAccountDao.queryById(capitalReceiptId);
    }
}
