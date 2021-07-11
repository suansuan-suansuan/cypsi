package com.cy.psi.dao;

import com.cy.psi.entity.SaleReturn;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 酸酸
 */
@Mapper
public interface SaleReturnDao {
    int deleteByPrimaryKey(String returnOrderId);

    int insert(SaleReturn record);

    int insertSelective(SaleReturn record);

    SaleReturn selectByPrimaryKey(String returnOrderId);

    int updateByPrimaryKeySelective(SaleReturn record);

    int updateByPrimaryKey(SaleReturn record);
}