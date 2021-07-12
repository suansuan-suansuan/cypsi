package com.cy.psi.dao;

import com.cy.psi.entity.BaseCustomer;
import com.cy.psi.vo.form.BaseCustomerQueryForm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (BaseCustomer)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-12 17:34:48
 */
@Mapper
public interface BaseCustomerDao {

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
    List<BaseCustomer> queryAll(BaseCustomerQueryForm baseCustomerQueryForm);

    /**
     * 通过实体作为或者条件查询
     *
     * @param baseCustomerQueryForm 实例对象
     * @return 对象列表
     */
    List<BaseCustomer> queryOrByPojo(BaseCustomerQueryForm baseCustomerQueryForm);

    /**
     * 通过实体作为并且条件查询
     *
     * @param baseCustomerQueryForm 实例对象
     * @return 对象列表
     */
    List<BaseCustomer> queryAndByPojo(BaseCustomerQueryForm baseCustomerQueryForm);

    /**
     * 新增数据
     *
     * @param baseCustomer 实例对象
     * @return 影响行数
     */
    int insert(BaseCustomer baseCustomer);
    
    /**
     * 修改数据
     *
     * @param baseCustomer 实例对象
     * @return 影响行数
     */
    int update(BaseCustomer baseCustomer);

    /**
     * 通过主键删除数据
     *
     * @param customerId 主键
     * @return 影响行数
     */
    int deleteById(Integer customerId);

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
     * @param baseCustomerList 实例对象列表
     * @return 影响行数
     */
    int deleteBatchByEntities(List<BaseCustomer> baseCustomerList);
}

