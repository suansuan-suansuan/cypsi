package com.cy.psi.dao;

import com.cy.psi.entity.BaseSettlementType;

public interface BaseSettlementTypeDao {
    int deleteByPrimaryKey(Integer settlementTypeId);

    int insert(BaseSettlementType record);

    int insertSelective(BaseSettlementType record);

    BaseSettlementType selectByPrimaryKey(Integer settlementTypeId);

    int updateByPrimaryKeySelective(BaseSettlementType record);

    int updateByPrimaryKey(BaseSettlementType record);
}