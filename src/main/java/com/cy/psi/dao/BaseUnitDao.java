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
     * 通过ID查询单条数据
     *
     * @param unitId 主键
     * @return 实例对象
     */
    BaseUnit queryById(Integer unitId);

    /**
     * 查询所有数据
     *
     * @param baseUnitQueryForm 实例对象
     * @return 实例对象
     */
    List<BaseUnit> queryAll(BaseUnitQueryForm baseUnitQueryForm);

    /**
     * 通过实体作为或者条件查询
     *
     * @param baseUnitQueryForm 实例对象
     * @return 对象列表
     */
    List<BaseUnit> queryOrByPojo(BaseUnitQueryForm baseUnitQueryForm);

    /**
     * 通过实体作为并且条件查询
     *
     * @param baseUnitQueryForm 实例对象
     * @return 对象列表
     */
    List<BaseUnit> queryAndByPojo(BaseUnitQueryForm baseUnitQueryForm);

    /**
     * 新增数据
     *
     * @param baseUnit 实例对象
     * @return 影响行数
     */
    int insert(BaseUnit baseUnit);

    /**
     * 修改数据
     *
     * @param baseUnit 实例对象
     * @return 影响行数
     */
    int update(BaseUnit baseUnit);
    
    /**
     * 通过主键删除数据
     *
     * @param unitId 主键
     * @return 影响行数
     */
    int deleteById(Integer unitId);

    /**
     * 通过主键列表删除数据
     *
     * @param ids 主键列表
     * @return 影响行数
     */
    int deleteBatch(List<Integer> ids);

    /**
     * 批量对象列表删除数据
     *
     * @param baseUnitList 实例对象列表
     * @return 影响行数
     */
    int deleteBatchByEntities(List<BaseUnit> baseUnitList);
}

