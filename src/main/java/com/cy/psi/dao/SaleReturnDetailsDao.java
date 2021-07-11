package com.cy.psi.dao;

import com.cy.psi.entity.SaleReturnDetails;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 酸酸
 */
@Mapper
public interface SaleReturnDetailsDao {
    int deleteByPrimaryKey(Integer id);

    int insert(SaleReturnDetails record);

    int insertSelective(SaleReturnDetails record);

    SaleReturnDetails selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SaleReturnDetails record);

    int updateByPrimaryKey(SaleReturnDetails record);
}