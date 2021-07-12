package com.cy.psi.service;

import com.cy.psi.entity.BaseVendor;

import java.util.List;

public interface BaseVendorService {

    /**
     * 分页查询供应商数据
     * @return
     */
    List<BaseVendor> selectAll();

    List<BaseVendor> selectAll88();

}
