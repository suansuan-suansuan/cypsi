package com.cy.psi.dao;

import com.cy.psi.entity.BaseCapitalAccount;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BaseCapitalAccountDao {
    int deleteByPrimaryKey(String capitalId);

    int insert(BaseCapitalAccount record);

    int insertSelective(BaseCapitalAccount record);

    BaseCapitalAccount selectByPrimaryKey(String capitalId);

    int updateByPrimaryKeySelective(BaseCapitalAccount record);

    int updateByPrimaryKey(BaseCapitalAccount record);

    void currentAmountadd(BaseCapitalAccount baseaccount);
}