package com.cy.psi.dao;

import com.cy.psi.entity.CapitalReceiptAccount;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CapitalReceiptAccountDao {
    int deleteByPrimaryKey(Integer id);

    int insert(CapitalReceiptAccount record);

    int insertSelective(CapitalReceiptAccount record);

    CapitalReceiptAccount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CapitalReceiptAccount record);

    int updateByPrimaryKey(CapitalReceiptAccount record);

    List<CapitalReceiptAccount> queryById(String capitalReceiptId);
}