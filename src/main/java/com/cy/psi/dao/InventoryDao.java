package com.cy.psi.dao;

import com.cy.psi.entity.Inventory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface InventoryDao {
    int deleteByPrimaryKey(String inventoryId);

    int insert(Inventory record);

    int insertSelective(Inventory record);

    Inventory selectByPrimaryKey(String inventoryId);

    int updateByPrimaryKeySelective(Inventory record);

    int updateByPrimaryKey(Inventory record);

    /**
     * s
     * @param productId
     * @param depot
     * @param productNum
     */
    void expectReduce(@Param("productId") String productId, @Param("depot") String depot, @Param("productNum") Integer productNum);
}