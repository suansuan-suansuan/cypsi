package com.cy.psi.service.Impl;

import com.cy.psi.dao.SaleDeliveryDetailsDao;
import com.cy.psi.entity.SaleDeliveryDetails;
import com.cy.psi.service.SaleDeliveryDetailsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author
 */
@Service("SaleDeliveryDetailsService")
public class SaleDeliveryDetailsServiceImpl implements SaleDeliveryDetailsService {
    @Resource
    private SaleDeliveryDetailsDao saleDeliveryDetailsDao;
    @Override
    public List<SaleDeliveryDetails> queryById(String id) {
        return this.saleDeliveryDetailsDao.queryById(id);
    }

    @Override
    public void insertBatch(List<SaleDeliveryDetails> deliverydetails) {
        this.saleDeliveryDetailsDao.insertBatch(deliverydetails);
    }
}
