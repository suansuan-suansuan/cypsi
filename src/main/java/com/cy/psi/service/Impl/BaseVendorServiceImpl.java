package com.cy.psi.service.Impl;

import com.cy.psi.dao.BaseVendorDao;
import com.cy.psi.entity.BaseVendor;
import com.cy.psi.service.BaseVendorService;
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
}
