package com.cy.psi.service.Impl;

import com.cy.psi.dao.BaseVendorDao;
import com.cy.psi.entity.BaseVendor;
import com.cy.psi.service.BaseVendorService;
import com.cy.psi.vo.form.BaseVendorQueryForm;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BaseVendorServiceImpl implements BaseVendorService {
    @Resource
    private BaseVendorDao baseVendorDao;

    /**
     * 分页查询仓库数据
     * @return
     */
    @Override
    public List<BaseVendor> selectAll(){
        return baseVendorDao.selectAll();
    }

    @Override
    public List<BaseVendor> selectAll88(){
        return baseVendorDao.selectAll88();
    }

    /**
     * 通过ID查询单条数据
     *
     * @param vendorId 主键
     * @return 实例对象
     */
    @Override
    public BaseVendor queryById(String vendorId) {
        return this.baseVendorDao.queryById(vendorId);
    }

    /**
     * 查询所有数据
     *
     * @param baseVendorQueryForm 实例对象
     * @return 实例对象
     */
    @Override
    public PageInfo<BaseVendor> queryAll(BaseVendorQueryForm baseVendorQueryForm) {
        Page<BaseVendor> page = PageHelper.startPage(baseVendorQueryForm.getPageNum(), baseVendorQueryForm.getPageSize());
        List<BaseVendor> baseVendorList = this.baseVendorDao.queryAll(baseVendorQueryForm);
        return new PageInfo<>(baseVendorList);
    }

    /**
     * 根据查询条件搜索数据
     *
     * @param baseVendorQueryForm
     * @return 对象列表
     */
    @Override
    public PageInfo<BaseVendor> queryBySearch(BaseVendorQueryForm baseVendorQueryForm) {
        Page<BaseVendor> page = PageHelper.startPage(baseVendorQueryForm.getPageNum(), baseVendorQueryForm.getPageSize());
        List<BaseVendor> baseVendorList = this.baseVendorDao.queryOrByPojo(baseVendorQueryForm);
        return new PageInfo<>(baseVendorList);
    }

    /**
     * 根据查询条件筛选数据
     *
     * @param baseVendorQueryForm
     * @return 对象列表
     */
    @Override
    public PageInfo<BaseVendor> queryByScreen(BaseVendorQueryForm baseVendorQueryForm) {
        Page<BaseVendor> page = PageHelper.startPage(baseVendorQueryForm.getPageNum(), baseVendorQueryForm.getPageSize());
        List<BaseVendor> baseVendorList = this.baseVendorDao.queryAndByPojo(baseVendorQueryForm);
        return new PageInfo<>(baseVendorList);
    }

    /**
     * 新增数据
     *
     * @param baseVendor 实例对象
     * @return 实例对象
     */
    @Override
    public BaseVendor insert(BaseVendor baseVendor) {
        this.baseVendorDao.insert(baseVendor);
        return this.queryById(baseVendor.getVendorId());
    }

    /**
     * 修改数据
     *
     * @param baseVendor 实例对象
     * @return 实例对象
     */
    @Override
    public BaseVendor update(BaseVendor baseVendor) {
        this.baseVendorDao.update(baseVendor);
        return this.queryById(baseVendor.getVendorId());
    }

    /**
     * 通过主键删除数据
     *
     * @param vendorId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String vendorId) {
        return this.baseVendorDao.deleteById(vendorId) > 0;
    }

    /**
     * 批量删除数据
     *
     * @param ids 主键列表
     * @return 影响行数
     */
    @Override
    public boolean deleteBatch(List<Integer> ids) {
        int row = this.baseVendorDao.deleteBatch(ids);
        return ids.size() == row;
    }
}
