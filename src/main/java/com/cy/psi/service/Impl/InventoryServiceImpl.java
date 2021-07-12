package com.cy.psi.service.Impl;

import com.cy.psi.dao.InventoryDao;
import com.cy.psi.service.InventoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

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



    /**
     * dfy查询库存明细
     * @return
     */
    @Override
    public List<Map<String, Object>> listProduct(Map map) {
        return inventoryDao.listProduct(map);
    }

    @Override
    public void expectAdd(String productId, String depot, Integer productNum) {
        this.inventoryDao.expectAdd(productId,depot,productNum);
    }
}
