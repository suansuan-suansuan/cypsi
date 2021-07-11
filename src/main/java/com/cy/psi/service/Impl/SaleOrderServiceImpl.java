package com.cy.psi.service.Impl;

import com.cy.psi.dao.SaleOrderDao;
import com.cy.psi.entity.SaleOrder;
import com.cy.psi.service.SaleOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 酸酸
 */
@Service("SaleOrderService")
public class SaleOrderServiceImpl implements SaleOrderService {
    @Resource
    private SaleOrderDao saleOrderDao;
    @Override
    public void update(SaleOrder saleOrder) {
        this.saleOrderDao.update(saleOrder);
    }

    @Override
    public void insert(SaleOrder saleOrder) {
        this.saleOrderDao.insert(saleOrder);
    }
}
