package com.cy.psi.dao;

import com.cy.psi.entity.BaseVendor;

import java.util.List;

public interface BaseVendorDao {
    int deleteByPrimaryKey(String vendorId);

    int insert(BaseVendor record);

    int insertSelective(BaseVendor record);

    BaseVendor selectByPrimaryKey(String vendorId);

    int updateByPrimaryKeySelective(BaseVendor record);

    int updateByPrimaryKey(BaseVendor record);

    List<BaseVendor> selectAll();
}