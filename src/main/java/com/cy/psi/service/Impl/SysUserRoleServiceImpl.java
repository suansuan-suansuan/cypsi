package com.cy.psi.service.Impl;

import com.cy.psi.dao.SysUserRoleDao;
import com.cy.psi.service.SysUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserRoleServiceImpl implements SysUserRoleService {
    @Autowired
    private SysUserRoleDao sysUserRoleDao;

    @Override
    public List<String> queryRoleIdbyUserId(String userId) {
        return sysUserRoleDao.queryRoleIdbyUserId(userId);
    }
}
