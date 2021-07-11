package com.cy.psi.dao;

import com.cy.psi.entity.CapitalReceiptAccount;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CapitalReceiptAccountDao {
    int deleteByPrimaryKey(Integer id);

    int insert(CapitalReceiptAccount record);

    int insertSelective(CapitalReceiptAccount record);

    CapitalReceiptAccount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CapitalReceiptAccount record);

    int updateByPrimaryKey(CapitalReceiptAccount record);
}