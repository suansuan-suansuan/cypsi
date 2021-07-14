package com.cy.psi.service;

import com.cy.psi.entity.Allotwarehouse;
import com.cy.psi.entity.Inventory;

import java.util.List;

/**
 * (Inventory)表服务接口
 *
 * @author makejava
 * @since 2021-07-11 15:23:35
 */
public interface ChangewarehouseService {
    /**
     分页查询全部
     */
    List<Inventory> selectChangewarehouse();

    /**
     高级查询
     */
    List<Inventory> selectBylikeChangewarehouse(String depotName, String productName);

    //逻辑删除
    Integer DelChangewarehouse( Integer timeLiness,String inventoryId);

}
