package com.cy.psi.service.Impl;

import com.cy.psi.dao.CapitalReceivableDao;
import com.cy.psi.entity.CapitalReceivable;
import com.cy.psi.service.CapitalReceivableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author
 */
@Service("CapitalReceivableService")
public class CapitalReceivableServiceImpl implements CapitalReceivableService {
    @Resource
    private CapitalReceivableDao capitalReceivableDao;
    @Override
    public void insert(CapitalReceivable receivable) {
        this.capitalReceivableDao.insert(receivable);
    }
}
