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
    List<Inventory> selectBylikeChangewarehouse(String serialNumber, String documentmaker, String depotName);

    /**
     * 通过主键删除数据
     *
     * @param inventoryId 主键
     * @return 是否成功
     */
    boolean deleteById(String inventoryId);

}
