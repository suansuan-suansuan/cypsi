package com.cy.psi.service;

import com.cy.psi.entity.BaseDepot;
import com.cy.psi.vo.form.BaseDepotQueryForm;

import java.util.List;

import com.github.pagehelper.PageInfo;

/**
 * (BaseDepot)表服务接口
 *
 * @author makejava
 * @since 2021-07-12 18:19:51
 */
public interface BaseDepotService {

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
    PageInfo<BaseDepot> queryAll(BaseDepotQueryForm baseDepotQueryForm);

    /**
     * 根据查询条件搜索数据
     *
     * @param baseDepotQueryForm
     * @return 对象列表
     */
    PageInfo<BaseDepot> queryBySearch(BaseDepotQueryForm baseDepotQueryForm);

    /**
     * 根据查询条件筛选数据
     *
     * @param baseDepotQueryForm
     * @return 对象列表
     */
    PageInfo<BaseDepot> queryByScreen(BaseDepotQueryForm baseDepotQueryForm);

    /**
     * 新增数据
     *
     * @param baseDepot 实例对象
     * @return 实例对象
     */
    BaseDepot insert(BaseDepot baseDepot);

    /**
     * 修改数据
     *
     * @param baseDepot 实例对象
     * @return 实例对象
     */
    BaseDepot update(BaseDepot baseDepot);

    /**
     * 通过主键删除数据
     *
     * @param depotId 主键
     * @return 是否成功
     */
    boolean deleteById(String depotId);

    /**
     * 批量删除数据
     *
     * @param ids 主键列表
     * @return 是否成功
     */
    boolean deleteBatch(List<Integer> ids);
}
