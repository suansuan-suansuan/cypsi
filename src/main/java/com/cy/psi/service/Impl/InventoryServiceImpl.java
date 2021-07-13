package com.cy.psi.service.Impl;

import com.cy.psi.dao.InventoryDao;
import com.cy.psi.service.InventoryService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
     * 查询库存明细
     * @return
     */
    @Override
    public PageInfo<Map<String, Object>> findProduct(Map map) {
        PageHelper.startPage((int)map.get("page"),(int)map.get("pageSize"));
        List<Map<String, Object>> maps = inventoryDao.listProduct(map);
        PageInfo<Map<String, Object>> mapPageInfo = new PageInfo<>(maps);
        return mapPageInfo;
    }

    /**
     * 库存商品报警
     *
     * @param map
     * @return
     */
    @Override
    public PageInfo<Map<String, Object>> findInventoryAlarm(Map map) {
        PageHelper.startPage((int)map.get("page"),(int)map.get("pageSize"));
        List<Map<String, Object>> maps = inventoryDao.inventoryAlarm(map);
        PageInfo<Map<String, Object>> mapPageInfo = new PageInfo<>(maps);
        return mapPageInfo;
    }

    /**
     * 查询过期商品
     * @param map
     * @return
     */
    @Override
    public PageInfo<Map<String, Object>> findGoodOut(Map map) {
        PageHelper.startPage((int)map.get("page"),(int)map.get("pageSize"));
        List<Map<String, Object>> maps = inventoryDao.listGood(map);
        PageInfo<Map<String, Object>> mapPageInfo = new PageInfo<>(maps);
        return mapPageInfo;
    }

    @Override
    public void expectAdd(String productId, String depot, Integer productNum) {
        this.inventoryDao.expectAdd(productId,depot,productNum);
    }
}
