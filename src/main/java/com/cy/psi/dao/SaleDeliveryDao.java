package com.cy.psi.dao;

import com.cy.psi.entity.SaleDelivery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 酸酸
 */
@Mapper
public interface SaleDeliveryDao {
    int deleteByPrimaryKey(String deliveryOrderId);

    int insert(SaleDelivery record);

    int insertSelective(SaleDelivery record);

    SaleDelivery selectByPrimaryKey(String deliveryOrderId);

    int updateByPrimaryKeySelective(SaleDelivery record);

    int updateByPrimaryKey(SaleDelivery record);
    
    
    
//    ========================================我唐某的地盘=============================================================
    /**
     查询全部
     */
    List<SaleDelivery> selectOutwarehouse();

    /**
     搞鸡查询
     */
    List<SaleDelivery> selectBylikeOutwarehouse(@Param("Starttime") String Starttime, @Param("Endtime") String Endtime, @Param("salesmen") String salesmen, @Param("remarks") String remarks);

    //审核    出库单
    Integer OutwarehouseAudit(@Param("approvalState") Integer approvalState, @Param("approvalTime")String approvalTime, @Param("deliveryOrderId")String deliveryOrderId);

    /**
     * 通过主键删除数据
     *
     * @param deliveryOrderId 主键
     * @return 影响行数
     */
    int deleteById(String deliveryOrderId);

    SaleDelivery queryByIdVo(String id);

    SaleDelivery queryById(String deliveryOrderId);
}