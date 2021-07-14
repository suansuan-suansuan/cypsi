package com.cy.psi.service;

import com.cy.psi.entity.SysUserRole;

import java.util.List;

public interface SysUserRoleService {

    int insert(SysUserRole record);

    int insertSelective(SysUserRole record);

    List<String> queryRoleIdbyUserId(String userId);

    List<SysUserRole> selectUserAllRole(String userId);

    void delUserRole(SysUserRole sysUserRole);

}
