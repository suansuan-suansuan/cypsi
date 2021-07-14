package com.cy.psi.dao;

import com.cy.psi.entity.BaseUnit;
import com.cy.psi.vo.form.BaseUnitQueryForm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (BaseUnit)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-12 17:48:10
 */
@Mapper
public interface BaseUnitDao {

    /**
     * 下拉查询所有
     * @return
     */
    List<BaseUnit> queryAll();
}

