package com.cy.psi.service.Impl;

import com.cy.psi.entity.BaseDepot;
import com.cy.psi.vo.form.BaseDepotQueryForm;
import com.cy.psi.dao.BaseDepotDao;
import com.cy.psi.service.BaseDepotService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * (BaseDepot)表服务实现类
 *
 * @author makejava
 * @since 2021-07-12 18:19:51
 */
@Service("baseDepotService")
public class BaseDepotServiceImpl implements BaseDepotService {
    @Resource
    private BaseDepotDao baseDepotDao;

    /**
     * 通过ID查询单条数据
     *
     * @param depotId 主键
     * @return 实例对象
     */
    @Override
    public BaseDepot queryById(String depotId) {
        return this.baseDepotDao.queryById(depotId);
    }

    /**
     * 查询所有数据
     *
     * @param baseDepotQueryForm 实例对象
     * @return 实例对象
     */
    @Override
    public PageInfo<BaseDepot> queryAll(BaseDepotQueryForm baseDepotQueryForm) {
        Page<BaseDepot> page = PageHelper.startPage(baseDepotQueryForm.getPageNum(), baseDepotQueryForm.getPageSize());
        List<BaseDepot> baseDepotList = this.baseDepotDao.queryAll(baseDepotQueryForm);
        return new PageInfo<>(baseDepotList);
    }

    /**
     * 根据查询条件搜索数据
     *
     * @param baseDepotQueryForm
     * @return 对象列表
     */
    @Override
    public PageInfo<BaseDepot> queryBySearch(BaseDepotQueryForm baseDepotQueryForm) {
        Page<BaseDepot> page = PageHelper.startPage(baseDepotQueryForm.getPageNum(), baseDepotQueryForm.getPageSize());
        List<BaseDepot> baseDepotList = this.baseDepotDao.queryOrByPojo(baseDepotQueryForm);
        return new PageInfo<>(baseDepotList);
    }

    /**
     * 根据查询条件筛选数据
     *
     * @param baseDepotQueryForm
     * @return 对象列表
     */
    @Override
    public PageInfo<BaseDepot> queryByScreen(BaseDepotQueryForm baseDepotQueryForm) {
        Page<BaseDepot> page = PageHelper.startPage(baseDepotQueryForm.getPageNum(), baseDepotQueryForm.getPageSize());
        List<BaseDepot> baseDepotList = this.baseDepotDao.queryAndByPojo(baseDepotQueryForm);
        return new PageInfo<>(baseDepotList);
    }

    /**
     * 新增数据
     *
     * @param baseDepot 实例对象
     * @return 实例对象
     */
    @Override
    public BaseDepot insert(BaseDepot baseDepot) {
        this.baseDepotDao.insert(baseDepot);
        return this.queryById(baseDepot.getDepotId());
    }

    /**
     * 修改数据
     *
     * @param baseDepot 实例对象
     * @return 实例对象
     */
    @Override
    public BaseDepot update(BaseDepot baseDepot) {
        this.baseDepotDao.update(baseDepot);
        return this.queryById(baseDepot.getDepotId());
    }

    /**
     * 通过主键删除数据
     *
     * @param depotId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String depotId) {
        return this.baseDepotDao.deleteById(depotId) > 0;
    }

    /**
     * 批量删除数据
     *
     * @param ids 主键列表
     * @return 影响行数
     */
    @Override
    public boolean deleteBatch(List<Integer> ids) {
        int row = this.baseDepotDao.deleteBatch(ids);
        return ids.size() == row;
    }
}