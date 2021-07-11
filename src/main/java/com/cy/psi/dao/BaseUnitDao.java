package com.cy.psi.dao;

import com.cy.psi.entity.BaseUnit;

public interface BaseUnitDao {
    int deleteByPrimaryKey(Integer unitId);

    int insert(BaseUnit record);

    int insertSelective(BaseUnit record);

    BaseUnit selectByPrimaryKey(Integer unitId);

    int updateByPrimaryKeySelective(BaseUnit record);

    int updateByPrimaryKey(BaseUnit record);
}