package com.cy.psi.dao;

import com.cy.psi.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysUserDao {
    int deleteByPrimaryKey(String uId);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(String uId);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    String queryUserIdByUserName(String username);

    List<SysUser> selectAll();
}