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
     * 查询所有数据
     *
     * @param baseUnitQueryForm 实例对象
     * @return 实例对象
     */
    List<BaseUnit> queryAll(BaseUnitQueryForm baseUnitQueryForm);

}

