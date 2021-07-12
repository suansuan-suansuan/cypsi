package com.cy.psi.service.Impl;

import com.cy.psi.dao.BaseCustomerDao;
import com.cy.psi.entity.BaseCustomer;
import com.cy.psi.service.BaseCustomerService;
import com.cy.psi.vo.form.BaseCustomerQueryForm;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (BaseCustomer)表服务实现类
 *
 * @author makejava
 * @since 2021-07-12 17:34:49
 */
@Service("baseCustomerService")
public class BaseCustomerServiceImpl implements BaseCustomerService {
    @Resource
    private BaseCustomerDao baseCustomerDao;

    /**
     * 通过ID查询单条数据
     *
     * @param customerId 主键
     * @return 实例对象
     */
    @Override
    public BaseCustomer queryById(Integer customerId) {
        return this.baseCustomerDao.queryById(customerId);
    }

    /**
     * 查询所有数据
     *
     * @param baseCustomerQueryForm 实例对象
     * @return 实例对象
     */
    @Override
    public PageInfo<BaseCustomer> queryAll(BaseCustomerQueryForm baseCustomerQueryForm) {
        Page<BaseCustomer> page = PageHelper.startPage(baseCustomerQueryForm.getPageNum(), baseCustomerQueryForm.getPageSize());
        List<BaseCustomer> baseCustomerList = this.baseCustomerDao.queryAll(baseCustomerQueryForm);
        return new PageInfo<>(baseCustomerList);
    }

    /**
     * 根据查询条件搜索数据
     *
     * @param baseCustomerQueryForm
     * @return 对象列表
     */
    @Override
    public PageInfo<BaseCustomer> queryBySearch(BaseCustomerQueryForm baseCustomerQueryForm) {
        Page<BaseCustomer> page = PageHelper.startPage(baseCustomerQueryForm.getPageNum(), baseCustomerQueryForm.getPageSize());
        List<BaseCustomer> baseCustomerList = this.baseCustomerDao.queryOrByPojo(baseCustomerQueryForm);
        return new PageInfo<>(baseCustomerList);
    }

    /**
     * 根据查询条件筛选数据
     *
     * @param baseCustomerQueryForm
     * @return 对象列表
     */
    @Override
    public PageInfo<BaseCustomer> queryByScreen(BaseCustomerQueryForm baseCustomerQueryForm) {
        Page<BaseCustomer> page = PageHelper.startPage(baseCustomerQueryForm.getPageNum(), baseCustomerQueryForm.getPageSize());
        List<BaseCustomer> baseCustomerList = this.baseCustomerDao.queryAndByPojo(baseCustomerQueryForm);
        return new PageInfo<>(baseCustomerList);
    }

    /**
     * 新增数据
     *
     * @param baseCustomer 实例对象
     * @return 实例对象
     */
    @Override
    public BaseCustomer insert(BaseCustomer baseCustomer) {
        this.baseCustomerDao.insert(baseCustomer);
        return this.queryById(baseCustomer.getCustomerId());
    }

    /**
     * 修改数据
     *
     * @param baseCustomer 实例对象
     * @return 实例对象
     */
    @Override
    public BaseCustomer update(BaseCustomer baseCustomer) {
        this.baseCustomerDao.update(baseCustomer);
        return this.queryById(baseCustomer.getCustomerId());
    }

    /**
     * 通过主键删除数据
     *
     * @param customerId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer customerId) {
        return this.baseCustomerDao.deleteById(customerId) > 0;
    }

    /**
     * 批量删除数据
     *
     * @param ids 主键列表
     * @return 影响行数
     */
    @Override
    public boolean deleteBatch(List<Integer> ids) {
        int row = this.baseCustomerDao.deleteBatch(ids);
        return ids.size() == row;
    }
}
