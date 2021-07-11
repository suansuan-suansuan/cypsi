package com.cy.psi.dao;

import com.cy.psi.entity.Allotwarehouse;
import com.cy.psi.entity.SaleDelivery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (SaleDelivery)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-11 14:16:37
 */
@Mapper
public interface OutwarehouseDao {

    /**
     查询全部
     */
    List<SaleDelivery> selectOutwarehouse();

    /**
     搞鸡查询
     */
    List<SaleDelivery> selectBylikeOutwarehouse(@Param("Starttime") String Starttime, @Param("Endtime") String Endtime, @Param("remarks") String remarks);

    //审核    出库单
    Integer OutwarehouseAudit(@Param("approvalState") Integer approvalState, @Param("deliveryOrderId")Integer deliveryOrderId);

    /**
     * 通过主键删除数据
     *
     * @param deliveryOrderId 主键
     * @return 影响行数
     */
    int deleteById(String deliveryOrderId);

}

