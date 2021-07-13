package com.cy.psi.service.Impl;

import com.cy.psi.dao.BaseUnitDao;
import com.cy.psi.entity.BaseUnit;
import com.cy.psi.service.BaseUnitService;
import com.cy.psi.vo.form.BaseUnitQueryForm;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (BaseUnit)表服务实现类
 *
 * @author makejava
 * @since 2021-07-12 23:18:19
 */
@Service("baseUnitService")
public class BaseUnitServiceImpl implements BaseUnitService {
    @Resource
    private BaseUnitDao baseUnitDao;

    /**
     * 下拉框查询所有单位数据
     * @return
     */
    @Override
    public List<BaseUnit> selectAll() {
        return this.baseUnitDao.queryAll();
    }
}
