package com.cy.psi.service.Impl;

import com.cy.psi.dao.BaseProductDao;
import com.cy.psi.entity.BaseDepot;
import com.cy.psi.entity.BaseProduct;
import com.cy.psi.service.BaseProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class BaseProductServiceImpl implements BaseProductService {
    @Resource
    private BaseProductDao baseProductDao;

    @Override
    public List<BaseProduct> SelectAll() {
        return baseProductDao.selectAll();
    }

    @Override
    public List<BaseProduct> GenJuselectAll() {
        return baseProductDao.GenJuselectAll();
    }

}
