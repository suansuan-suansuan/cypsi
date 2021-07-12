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
     * 查询所有数据
     *
     * @param baseUnitQueryForm 实例对象
     * @return 实例对象
     */
    PageInfo<BaseUnit> queryAll(BaseUnitQueryForm baseUnitQueryForm);
    
}
