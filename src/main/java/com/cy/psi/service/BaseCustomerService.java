package com.cy.psi.service;

import com.cy.psi.entity.BaseCustomer;
import com.cy.psi.vo.form.BaseCustomerQueryForm;

import java.util.List;

import com.github.pagehelper.PageInfo;

/**
 * (BaseCustomer)表服务接口
 *
 * @author makejava
 * @since 2021-07-12 17:34:49
 */
public interface BaseCustomerService {

    /**
     * 通过ID查询单条数据
     *
     * @param customerId 主键
     * @return 实例对象
     */
    BaseCustomer queryById(Integer customerId);

    /**
     * 查询所有数据
     *
     * @param baseCustomerQueryForm 实例对象
     * @return 实例对象
     */
    PageInfo<BaseCustomer> queryAll(BaseCustomerQueryForm baseCustomerQueryForm);

    /**
     * 根据查询条件搜索数据
     *
     * @param baseCustomerQueryForm
     * @return 对象列表
     */
    PageInfo<BaseCustomer> queryBySearch(BaseCustomerQueryForm baseCustomerQueryForm);

    /**
     * 根据查询条件筛选数据
     *
     * @param baseCustomerQueryForm
     * @return 对象列表
     */
    PageInfo<BaseCustomer> queryByScreen(BaseCustomerQueryForm baseCustomerQueryForm);

    /**
     * 新增数据
     *
     * @param baseCustomer 实例对象
     * @return 实例对象
     */
    BaseCustomer insert(BaseCustomer baseCustomer);

    /**
     * 修改数据
     *
     * @param baseCustomer 实例对象
     * @return 实例对象
     */
    BaseCustomer update(BaseCustomer baseCustomer);

    /**
     * 通过主键删除数据
     *
     * @param customerId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer customerId);

    /**
     * 批量删除数据
     *
     * @param ids 主键列表
     * @return 是否成功
     */
    boolean deleteBatch(List<Integer> ids);
}
