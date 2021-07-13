package com.cy.psi.service.Impl;

import com.cy.psi.dao.SysUserRoleDao;
import com.cy.psi.entity.SysUserRole;
import com.cy.psi.service.SysUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserRoleServiceImpl implements SysUserRoleService {
    @Autowired
    private SysUserRoleDao sysUserRoleDao;

    @Override
    public int insert(SysUserRole record) {
        return sysUserRoleDao.insert(record);
    }

    @Override
    public int insertSelective(SysUserRole record) {
        return sysUserRoleDao.insertSelective(record);
    }

    @Override
    public List<String> queryRoleIdbyUserId(String userId) {
        return sysUserRoleDao.queryRoleIdbyUserId(userId);
    }

    @Override
    public List<SysUserRole> selectUserAllRole(String userId){
        return sysUserRoleDao.selectUserAllRole(userId);
    }

    @Override
    public void delUserRole(SysUserRole sysUserRole) {
        sysUserRoleDao.delUserRole(sysUserRole);
    }
}
