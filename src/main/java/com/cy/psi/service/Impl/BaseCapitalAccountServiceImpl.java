package com.cy.psi.service.Impl;

import com.cy.psi.dao.BaseCapitalAccountDao;
import com.cy.psi.entity.BaseCapitalAccount;
import com.cy.psi.service.BaseCapitalAccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("BaseCapitalAccountService")
public class BaseCapitalAccountServiceImpl implements BaseCapitalAccountService {
    @Resource
    private BaseCapitalAccountDao baseCapitalAccountDao;
    @Override
    public void currentAmountadd(BaseCapitalAccount baseaccount) {
        this.baseCapitalAccountDao.currentAmountadd(baseaccount);

    }
}
