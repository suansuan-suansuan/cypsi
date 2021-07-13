package com.cy.psi.dao;

import com.cy.psi.entity.BaseDepot;
import com.cy.psi.vo.form.BaseDepotQueryForm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (BaseDepot)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-12 18:19:50
 */
@Mapper
public interface BaseDepotDao {

    /**
     * 通过ID查询单条数据
     *
     * @param depotId 主键
     * @return 实例对象
     */
    BaseDepot queryById(String depotId);

    /**
     * 查询所有数据
     *
     * @param baseDepotQueryForm 实例对象
     * @return 实例对象
     */
    List<BaseDepot> queryAll(BaseDepotQueryForm baseDepotQueryForm);


    List<BaseDepot> queryAllWWWW();
    /**
     * 通过实体作为或者条件查询
     *
     * @param baseDepotQueryForm 实例对象
     * @return 对象列表
     */
    List<BaseDepot> queryOrByPojo(BaseDepotQueryForm baseDepotQueryForm);

    /**
     * 通过实体作为并且条件查询
     *
     * @param baseDepotQueryForm 实例对象
     * @return 对象列表
     */
    List<BaseDepot> queryAndByPojo(BaseDepotQueryForm baseDepotQueryForm);

    /**
     * 新增数据
     *
     * @param baseDepot 实例对象
     * @return 影响行数
     */
    int insert(BaseDepot baseDepot);

    /**
     * 修改数据
     *
     * @param baseDepot 实例对象
     * @return 影响行数
     */
    int update(BaseDepot baseDepot);


    /**
     * 通过主键删除数据
     *
     * @param depotId 主键
     * @return 影响行数
     */
    int deleteById(String depotId);

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
     * @param baseDepotList 实例对象列表
     * @return 影响行数
     */
    int deleteBatchByEntities(List<BaseDepot> baseDepotList);
}

