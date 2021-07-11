package com.cy.psi.dao;

import com.cy.psi.entity.Inventory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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
    /**
     查询全部
     */
    List<Inventory> selectChangewarehouse();

    /**
     搞鸡查询
     */
    List<Inventory> selectBylikeChangewarehouse(@Param("serialNumber") String serialNumber, @Param("documentmaker") String documentmaker, @Param("depotName") String depotName);

    /**
     * 通过主键删除数据
     *
     * @param inventoryId 主键
     * @return 影响行数
     */
    int deleteById(String inventoryId);
}