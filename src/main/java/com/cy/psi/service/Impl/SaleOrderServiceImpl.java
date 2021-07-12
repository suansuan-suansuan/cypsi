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
    public SaleOrder update(SaleOrder saleOrder) {
        this.saleOrderDao.update(saleOrder);
        return this.saleOrderDao.queryById(saleOrder.getSaleOrderId());
    }

    @Override
    public void insert(SaleOrder saleOrder) {
        this.saleOrderDao.insert(saleOrder);
    }

    @Override
    public SaleOrder queryById(String id) {
        return this.saleOrderDao.queryById(id);
    }

    @Override
    public void advanceadd(SaleOrder order) {
        this.saleOrderDao.advanceadd(order);
    }
}
