package com.cy.psi.service.Impl;

import com.alibaba.fastjson.JSONArray;
import com.cy.psi.entity.BaseProduct;
import com.cy.psi.vo.BaseProductVo;
import com.cy.psi.vo.form.BaseProductQueryForm;
import com.cy.psi.dao.BaseProductDao;
import com.cy.psi.service.BaseProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.transaction.annotation.Transactional;

/**
 * (BaseProduct)表服务实现类
 *
 * @author makejava
 * @since 2021-07-12 17:52:37
 */
@Service("baseProductService")
public class BaseProductServiceImpl implements BaseProductService {
    @Resource
    private BaseProductDao baseProductDao;

    @Override
    public List<BaseProduct> GenJuselectAll() {
        return baseProductDao.GenJuselectAll();
    }

    /**
     * 通过ID查询单条数据
     *
     * @param productId 主键
     * @return 实例对象
     */
    @Override
    public BaseProduct queryById(Integer productId) {
        return this.baseProductDao.queryById(productId);
    }

    /**
     * 查询所有数据
     *
     * @param baseProductQueryForm 实例对象
     * @return 实例对象
     */
    @Override
    public PageInfo<BaseProduct> queryAll(BaseProductQueryForm baseProductQueryForm) {
        Page<BaseProduct> page = PageHelper.startPage(baseProductQueryForm.getPageNum(), baseProductQueryForm.getPageSize());
        List<BaseProduct> baseProductList = this.baseProductDao.queryAll(baseProductQueryForm);
        return new PageInfo<>(baseProductList);
    }

    /**
     * 根据查询条件搜索数据
     *
     * @param baseProductQueryForm
     * @return 对象列表
     */
    @Override
    public PageInfo<BaseProduct> queryBySearch(BaseProductQueryForm baseProductQueryForm) {
        Page<BaseProduct> page = PageHelper.startPage(baseProductQueryForm.getPageNum(), baseProductQueryForm.getPageSize());
        List<BaseProduct> baseProductList = this.baseProductDao.queryOrByPojo(baseProductQueryForm);
        return new PageInfo<>(baseProductList);
    }

    /**
     * 根据查询条件筛选数据
     *
     * @param baseProductQueryForm
     * @return 对象列表
     */
    @Override
    public PageInfo<BaseProduct> queryByScreen(BaseProductQueryForm baseProductQueryForm) {
        Page<BaseProduct> page = PageHelper.startPage(baseProductQueryForm.getPageNum(), baseProductQueryForm.getPageSize());
        List<BaseProduct> baseProductList = this.baseProductDao.queryAndByPojo(baseProductQueryForm);
        return new PageInfo<>(baseProductList);
    }

    /**
     * 新增数据
     *
     * @param baseProduct 实例对象
     * @return 实例对象
     */
    @Transactional
    @Override
    public BaseProduct insert(BaseProduct baseProduct) {
        this.baseProductDao.insert(baseProduct);
        return this.queryById(baseProduct.getProductId());
    }

    /**
     * 批量新增数据
     *
     * @param BaseProductList 实例对象列表
     * @return 影响行数
     */
    @Override
    @Transactional
    public boolean insertBatch(List<BaseProduct> BaseProductList) {
        return this.baseProductDao.insertBatch(BaseProductList) == -1;
    }

    /**
     * 修改数据
     *
     * @param baseProduct 实例对象
     * @return 实例对象
     */
    @Transactional
    @Override
    public BaseProduct update(BaseProduct baseProduct) {
        this.baseProductDao.update(baseProduct);
        return this.queryById(baseProduct.getProductId());
    }

    /**
     * 批量修改数据
     *
     * @param baseProductList 实例对象列表
     * @return 影响行数
     */
    @Override
    @Transactional
    public boolean updateBatch(List<BaseProduct> baseProductList) {
        return this.baseProductDao.updateBatch(baseProductList) == -1;
    }

    /**
     * 通过主键删除数据
     *
     * @param productId 主键
     * @return 是否成功
     */
    @Transactional
    @Override
    public boolean deleteById(Integer productId) {
        return this.baseProductDao.deleteById(productId) > 0;
    }

    /**
     * 批量删除数据
     *
     * @param ids 主键列表
     * @return 影响行数
     */
    @Override
    @Transactional
    public boolean deleteBatch(List<Integer> ids) {
        int row = this.baseProductDao.deleteBatch(ids);
        return ids.size() == row;
    }

    @Override
    public JSONArray queryAllProduct() {
        return this.baseProductDao.queryAllProduct();
    }
}