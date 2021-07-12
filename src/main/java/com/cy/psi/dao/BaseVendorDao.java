package com.cy.psi.dao;

import com.cy.psi.entity.BaseVendor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BaseVendorDao {
    int deleteByPrimaryKey(String vendorId);

    int insert(BaseVendor record);

    int insertSelective(BaseVendor record);

    BaseVendor selectByPrimaryKey(String vendorId);

    int updateByPrimaryKeySelective(BaseVendor record);

    int updateByPrimaryKey(BaseVendor record);

    List<BaseVendor> selectAll();

    List<BaseVendor> selectAll88();
}