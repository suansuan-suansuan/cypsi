package com.cy.psi.service.Impl;

import com.cy.psi.dao.SysRoleMenuDao;
import com.cy.psi.entity.SysRoleMenu;
import com.cy.psi.service.SysRoleMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 角色菜单联系业务实现层
 * */
@Service
public class SysRoleMenuServiceImpl implements SysRoleMenuService {
    @Autowired
    private SysRoleMenuDao sysRoleMenuDao;
    @Override
    public int insert(SysRoleMenu record) {
        return sysRoleMenuDao.insert(record);
    }

    @Override
    public int insertSelective(SysRoleMenu record) {
        return sysRoleMenuDao.insertSelective(record);
    }

    @Override
    public void delRoleMenu(SysRoleMenu sysRoleMenu) {
        sysRoleMenuDao.delRoleMenu(sysRoleMenu);
    }
}
