package com.cy.psi.service.Impl;

import com.cy.psi.dao.InventoryDao;
import com.cy.psi.entity.Inventory;
import com.cy.psi.service.ChangewarehouseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Inventory)表服务实现类
 *
 * @author makejava
 * @since 2021-07-11 15:23:36
 */
@Service("inventoryService")
public class ChangewarehouseServiceImpl implements ChangewarehouseService {
    @Resource
    private InventoryDao inventoryDao;
    /**
     分页查询所有
     */
    @Override
    public List<Inventory> selectChangewarehouse() {
        return inventoryDao.selectChangewarehouse();
    }

    /**
     高级查询
     */
    @Override
    public List<Inventory> selectBylikeChangewarehouse(String depotName, String productName) {
        return inventoryDao.selectBylikeChangewarehouse(depotName,productName);
    }

    //修改   删除
    @Override
    public Integer DelChangewarehouse( Integer timeLiness,String inventoryId){
        return inventoryDao.DelChangewarehouse(timeLiness,inventoryId);
    }



}
