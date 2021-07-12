package com.cy.psi.service.Impl;

import com.cy.psi.dao.SaleDeliveryDao;
import com.cy.psi.entity.SaleDelivery;
import com.cy.psi.service.SaleDeliveryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author
 */
@Service("SaleDeliveryService")
public class SaleDeliveryServiceImpl implements SaleDeliveryService {
    @Resource
    private SaleDeliveryDao saleDeliveryDao;
    @Override
    public SaleDelivery queryByIdVo(String id) {
        return this.saleDeliveryDao.queryByIdVo(id);
    }

    @Override
    public void insert(SaleDelivery delivery) {
        this.saleDeliveryDao.insert(delivery);
    }

    @Override
    public SaleDelivery update(SaleDelivery saleDelivery) {
        this.saleDeliveryDao.updateByPrimaryKey(saleDelivery);
        return this.saleDeliveryDao.queryById(saleDelivery.getDeliveryOrderId());
    }
    /**
     * 通过ID查询单条数据
     *
     * @param deliveryId 主键
     * @return 实例对象
     */

}
