package com.cy.psi.dao;

import com.cy.psi.entity.CapitalReceiptBill;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 酸酸
 */
@Mapper
public interface CapitalReceiptBillDao {
    int deleteByPrimaryKey(Integer id);

    int insert(CapitalReceiptBill record);

    int insertSelective(CapitalReceiptBill record);

    CapitalReceiptBill selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CapitalReceiptBill record);

    int updateByPrimaryKey(CapitalReceiptBill record);
}