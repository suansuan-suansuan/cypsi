package com.cy.psi.dao;

import com.cy.psi.entity.BaseCustomer;

public interface BaseCustomerDao {
    int deleteByPrimaryKey(Integer customerId);

    int insert(BaseCustomer record);

    int insertSelective(BaseCustomer record);

    BaseCustomer selectByPrimaryKey(Integer customerId);

    int updateByPrimaryKeySelective(BaseCustomer record);

    int updateByPrimaryKey(BaseCustomer record);
}