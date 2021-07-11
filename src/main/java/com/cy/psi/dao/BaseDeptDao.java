package com.cy.psi.dao;

import com.cy.psi.entity.BaseDept;

public interface BaseDeptDao {
    int deleteByPrimaryKey(String deptId);

    int insert(BaseDept record);

    int insertSelective(BaseDept record);

    BaseDept selectByPrimaryKey(String deptId);

    int updateByPrimaryKeySelective(BaseDept record);

    int updateByPrimaryKey(BaseDept record);
}