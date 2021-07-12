package com.cy.psi.service.Impl;

import com.cy.psi.dao.InventoryDao;
import com.cy.psi.service.InventoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 酸酸
 */
@Service("InventoryService")
public class InventoryServiceImpl implements InventoryService {
    @Resource
    private InventoryDao inventoryDao;

    @Override
    public void expectReduce(String productId, String depot, Integer productNum) {
        this.inventoryDao.expectReduce(productId,depot,productNum);
    }

    @Override
    public void expectAdd(String productId, String depot, Integer productNum) {
        this.inventoryDao.expectAdd(productId,depot,productNum);
    }
}
