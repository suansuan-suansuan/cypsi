package com.cy.psi.dao;

import com.cy.psi.entity.Puorders;

public interface PuordersDao {
    int deleteByPrimaryKey(Integer puordersId);

    int insertPu(Puorders record);

    int insertSelective(Puorders record);

    Puorders selectByPrimaryKey(Integer puordersId);

    int updateByPrimaryKeySelective(Puorders record);

    int updateByPrimaryKey(Puorders record);
}