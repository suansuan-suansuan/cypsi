package com.cy.psi.dao;

import com.cy.psi.entity.CapitalReceipt;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 酸酸
 */
@Mapper
public interface CapitalReceiptDao {
    int deleteByPrimaryKey(String capitalReceiptId);

    int insert(CapitalReceipt record);

    int insertSelective(CapitalReceipt record);

    CapitalReceipt selectByPrimaryKey(String capitalReceiptId);

    int updateByPrimaryKeySelective(CapitalReceipt record);

    int updateByPrimaryKey(CapitalReceipt record);
}