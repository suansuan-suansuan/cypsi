package com.cy.psi.service;

import com.cy.psi.entity.BaseProduct;
import com.cy.psi.vo.form.BaseProductQueryForm;

import java.util.List;

import com.github.pagehelper.PageInfo;

/**
 * (BaseProduct)表服务接口
 *
 * @author makejava
 * @since 2021-07-12 17:52:37
 */
public interface BaseProductService {

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
    PageInfo<BaseProduct> queryAll(BaseProductQueryForm baseProductQueryForm);

    /**
     * 根据查询条件搜索数据
     *
     * @param baseProductQueryForm
     * @return 对象列表
     */
    PageInfo<BaseProduct> queryBySearch(BaseProductQueryForm baseProductQueryForm);

    /**
     * 根据查询条件筛选数据
     *
     * @param baseProductQueryForm
     * @return 对象列表
     */
    PageInfo<BaseProduct> queryByScreen(BaseProductQueryForm baseProductQueryForm);

    /**
     * 新增数据
     *
     * @param baseProduct 实例对象
     * @return 实例对象
     */
    BaseProduct insert(BaseProduct baseProduct);

    /**
     * 批量新增数据
     *
     * @param BaseProductList 实例对象列表
     * @return 影响行数
     */
    boolean insertBatch(List<BaseProduct> BaseProductList);

    /**
     * 修改数据
     *
     * @param baseProduct 实例对象
     * @return 实例对象
     */
    BaseProduct update(BaseProduct baseProduct);

    /**
     * 批量修改数据
     *
     * @param baseProductList 实例对象列表
     * @return 影响行数
     */
    boolean updateBatch(List<BaseProduct> baseProductList);

    /**
     * 通过主键删除数据
     *
     * @param productId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer productId);

    /**
     * 批量删除数据
     *
     * @param ids 主键列表
     * @return 是否成功
     */
    boolean deleteBatch(List<Integer> ids);
}
