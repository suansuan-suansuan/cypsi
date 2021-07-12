package com.cy.psi.dao;

import com.cy.psi.entity.BaseProduct;
import com.cy.psi.vo.form.BaseProductQueryForm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (BaseProduct)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-12 17:52:36
 */
@Mapper
public interface BaseProductDao {

    /**
     * 通过ID查询单条数据
     *
     * @param productId 主键
     * @return 实例对象
     */
    BaseProduct queryById(Integer productId);

    /**
     * 查询所有数据
     *
     * @param baseProductQueryForm 实例对象
     * @return 实例对象
     */
    List<BaseProduct> queryAll(BaseProductQueryForm baseProductQueryForm);

    /**
     * 通过实体作为或者条件查询
     *
     * @param baseProductQueryForm 实例对象
     * @return 对象列表
     */
    List<BaseProduct> queryOrByPojo(BaseProductQueryForm baseProductQueryForm);

    /**
     * 通过实体作为并且条件查询
     *
     * @param baseProductQueryForm 实例对象
     * @return 对象列表
     */
    List<BaseProduct> queryAndByPojo(BaseProductQueryForm baseProductQueryForm);

    /**
     * 新增数据
     *
     * @param baseProduct 实例对象
     * @return 影响行数
     */
    int insert(BaseProduct baseProduct);

    /**
     * 批量新增数据
     *
     * @param baseProductList 实例对象列表
     * @return 影响行数
     */
    int insertBatch(List<BaseProduct> baseProductList);

    /**
     * 修改数据
     *
     * @param baseProduct 实例对象
     * @return 影响行数
     */
    int update(BaseProduct baseProduct);

    /**
     * 批量修改数据
     *
     * @param baseProductList 实例对象列表
     * @return 影响行数
     */
    int updateBatch(List<BaseProduct> baseProductList);

    /**
     * 通过主键删除数据
     *
     * @param productId 主键
     * @return 影响行数
     */
    int deleteById(Integer productId);

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
     * @param baseProductList 实例对象列表
     * @return 影响行数
     */
    int deleteBatchByEntities(List<BaseProduct> baseProductList);
}

