package com.cy.psi.service.impl;

import com.cy.psi.entity.BaseUnit;
import com.cy.psi.vo.form.BaseUnitQueryForm;
import com.cy.psi.dao.BaseUnitDao;
import com.cy.psi.service.BaseUnitService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * (BaseUnit)表服务实现类
 *
 * @author makejava
 * @since 2021-07-12 17:48:11
 */
@Service("baseUnitService")
public class BaseUnitServiceImpl implements BaseUnitService {
    @Resource
    private BaseUnitDao baseUnitDao;
    
    /**
     * 查询所有数据
     *
     * @param baseUnitQueryForm 实例对象
     * @return 实例对象
     */
    @Override
    public PageInfo<BaseUnit> queryAll(BaseUnitQueryForm baseUnitQueryForm) {
        Page<BaseUnit> page = PageHelper.startPage(baseUnitQueryForm.getPageNum(), baseUnitQueryForm.getPageSize());
        List<BaseUnit> baseUnitList = this.baseUnitDao.queryAll(baseUnitQueryForm);
        return new PageInfo<>(baseUnitList);
    }
}
