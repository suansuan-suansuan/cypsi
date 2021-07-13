package com.cy.psi.dao;

import com.cy.psi.entity.SysUserRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface SysUserRoleDao {
    int insert(SysUserRole record);

    int insertSelective(SysUserRole record);

    List<SysUserRole> selectUserAllRole(@Param("userId") String userId);

    List<String> queryRoleIdbyUserId(String userId);

    void delUserRole(SysUserRole sysUserRole);
}