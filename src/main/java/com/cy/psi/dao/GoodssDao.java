package com.cy.psi.dao;

import com.cy.psi.entity.Goodss;

public interface GoodssDao {
    int deleteByPrimaryKey(Integer puordersId);

    int insert(Goodss record);

    int insertSelective(Goodss record);

    Goodss selectByPrimaryKey(Integer puordersId);

    int updateByPrimaryKeySelective(Goodss record);

    int updateByPrimaryKey(Goodss record);
}