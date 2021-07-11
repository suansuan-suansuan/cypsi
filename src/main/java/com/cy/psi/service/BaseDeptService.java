package com.cy.psi.service;

import com.cy.psi.entity.BaseDept;

import java.util.List;

public interface BaseDeptService {
    int deleteByPrimaryKey(Integer deptId);

    int insert(BaseDept record);

    int insertSelective(BaseDept record);

    BaseDept selectByPrimaryKey(Integer deptId);

    int updateByPrimaryKeySelective(BaseDept record);

    int updateByPrimaryKey(BaseDept record);

    List<BaseDept> findAllDept();


    Object findMaxId(int parent);
}