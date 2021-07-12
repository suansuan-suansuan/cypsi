package com.cy.psi.service;


import com.cy.psi.entity.SysRole;

import java.util.List;

/**
 * @Author Twx
 * @Date 2021/7/12 20:52
 * @Description 用户角色业务层
 * @Since version-1.0
 */
public interface SysRoleService {
    int deleteByPrimaryKey(String roleId);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(String roleId);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);

    List<SysRole> selectAllRole();
}
