package com.cy.psi.service;

import com.cy.psi.entity.SysRoleMenu;

/**
 * @Author Twx
 * @Date 2021/7/12 22:06
 * @Description 所有角色菜单操作项
 * @Since version-1.0
 */
public interface SysRoleMenuService {
    int insert(SysRoleMenu record);

    int insertSelective(SysRoleMenu record);

    void delRoleMenu(SysRoleMenu sysRoleMenu);
}
