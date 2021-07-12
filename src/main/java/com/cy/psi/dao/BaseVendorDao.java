package com.cy.psi.dao;

import com.cy.psi.entity.BaseVendor;
import com.cy.psi.vo.form.BaseVendorQueryForm;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BaseVendorDao {
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
    List<BaseVendor> queryAll(BaseVendorQueryForm baseVendorQueryForm);

    /**
     * 通过实体作为或者条件查询
     *
     * @param baseVendorQueryForm 实例对象
     * @return 对象列表
     */
    List<BaseVendor> queryOrByPojo(BaseVendorQueryForm baseVendorQueryForm);

    /**
     * 通过实体作为并且条件查询
     *
     * @param baseVendorQueryForm 实例对象
     * @return 对象列表
     */
    List<BaseVendor> queryAndByPojo(BaseVendorQueryForm baseVendorQueryForm);

    /**
     * 新增数据
     *
     * @param baseVendor 实例对象
     * @return 影响行数
     */
    int insert(BaseVendor baseVendor);

    /**
     * 修改数据
     *
     * @param baseVendor 实例对象
     * @return 影响行数
     */
    int update(BaseVendor baseVendor);

    /**
     * 通过主键删除数据
     *
     * @param vendorId 主键
     * @return 影响行数
     */
    int deleteById(String vendorId);

    /**
     * 通过主键列表删除数据
     *
     * @param ids 主键列表
     * @return 影响行数
     */
    int deleteBatch(List<Integer> ids);

    List<BaseVendor> selectAll();

    List<BaseVendor> selectAll88();
}