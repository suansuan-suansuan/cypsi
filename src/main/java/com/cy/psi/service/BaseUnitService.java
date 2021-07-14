package com.cy.psi.service;

import com.cy.psi.entity.BaseUnit;
import com.cy.psi.vo.form.BaseUnitQueryForm;

import java.util.List;

import com.github.pagehelper.PageInfo;

/**
 * (BaseUnit)表服务接口
 *
 * @author makejava
 * @since 2021-07-12 17:48:11
 */
public interface BaseUnitService {
    /**
     * 下拉框查询所有单位数据
     * @return
     */
    List<BaseUnit> selectAll();
}
