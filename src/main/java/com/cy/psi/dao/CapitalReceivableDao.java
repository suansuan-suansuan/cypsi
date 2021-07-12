package com.cy.psi.dao;

import com.cy.psi.entity.CapitalReceivable;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CapitalReceivableDao {
    int deleteByPrimaryKey(String deliveryId);

    int insert(CapitalReceivable record);

    int insertSelective(CapitalReceivable record);

    CapitalReceivable selectByPrimaryKey(String deliveryId);

    int updateByPrimaryKeySelective(CapitalReceivable record);

    int updateByPrimaryKey(CapitalReceivable record);

    CapitalReceivable receivedAdd(CapitalReceivable receivable);
}