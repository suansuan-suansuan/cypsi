package com.cy.psi.service;

import com.cy.psi.entity.BaseVendor;
import com.cy.psi.vo.form.BaseVendorQueryForm;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface BaseVendorService {

    /**
     * 分页查询供应商数据
     * @return
     */
    List<BaseVendor> selectAll();

    List<BaseVendor> selectAll88();

    /**
     * 通过ID查询单条数据
     *
     * @param vendorId 主键
     * @return 实例对象
     */
    BaseVendor queryById(String vendorId);

    /**
     * 查询所有数据
     *
     * @param baseVendorQueryForm 实例对象
     * @return 实例对象
     */
    PageInfo<BaseVendor> queryAll(BaseVendorQueryForm baseVendorQueryForm);

    /**
     * 根据查询条件搜索数据
     *
     * @param baseVendorQueryForm
     * @return 对象列表
     */
    PageInfo<BaseVendor> queryBySearch(BaseVendorQueryForm baseVendorQueryForm);

    /**
     * 根据查询条件筛选数据
     *
     * @param baseVendorQueryForm
     * @return 对象列表
     */
    PageInfo<BaseVendor> queryByScreen(BaseVendorQueryForm baseVendorQueryForm);

    /**
     * 新增数据
     *
     * @param baseVendor 实例对象
     * @return 实例对象
     */
    BaseVendor insert(BaseVendor baseVendor);

    /**
     * 修改数据
     *
     * @param baseVendor 实例对象
     * @return 实例对象
     */
    BaseVendor update(BaseVendor baseVendor);

    /**
     * 通过主键删除数据
     *
     * @param vendorId 主键
     * @return 是否成功
     */
    boolean deleteById(String vendorId);

    /**
     * 批量删除数据
     *
     * @param ids 主键列表
     * @return 是否成功
     */
    boolean deleteBatch(List<Integer> ids);

}
