package com.cy.psi.service.Impl;

import com.cy.psi.dao.CapitalReceiptDao;
import com.cy.psi.entity.CapitalReceipt;
import com.cy.psi.service.CapitalReceiptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author
 */
@Service("CapitalReceiptService")
public class CapitalReceiptServiceImpl implements CapitalReceiptService {
    @Resource
    private CapitalReceiptDao capitalReceiptDao;
    @Override
    public CapitalReceipt insert(CapitalReceipt receipt) {
    this.capitalReceiptDao.insert(receipt);
    return receipt;
    }

    @Override
    public CapitalReceipt queryById(String orderid) {
        return this.capitalReceiptDao.selectByPrimaryKey(orderid);
    }

    @Override
    public void update(CapitalReceipt receipt) {
        this.capitalReceiptDao.updateByPrimaryKey(receipt);
    }
}
