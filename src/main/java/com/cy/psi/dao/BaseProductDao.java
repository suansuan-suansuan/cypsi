package com.cy.psi.dao;

import com.cy.psi.entity.BaseProduct;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BaseProductDao {
    int deleteByPrimaryKey(Integer productId);

    int insert(BaseProduct record);

    int insertSelective(BaseProduct record);

    BaseProduct selectByPrimaryKey(Integer productId);

    int updateByPrimaryKeySelective(BaseProduct record);

    int updateByPrimaryKey(BaseProduct record);

    List<BaseProduct> selectAll();

    List<BaseProduct> GenJuselectAll();
}