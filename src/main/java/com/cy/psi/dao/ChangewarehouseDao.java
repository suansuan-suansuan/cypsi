package com.cy.psi.dao;

import com.cy.psi.entity.Allotwarehouse;
import com.cy.psi.entity.Inventory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Inventory)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-11 15:23:35
 */
@Mapper
public interface ChangewarehouseDao {
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

