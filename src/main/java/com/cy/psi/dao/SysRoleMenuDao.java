package com.cy.psi.dao;

import com.cy.psi.entity.SysRoleMenu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface SysRoleMenuDao {
    int insert(SysRoleMenu record);

    int insertSelective(SysRoleMenu record);

    void delRoleMenu(SysRoleMenu sysRoleMenu);
}