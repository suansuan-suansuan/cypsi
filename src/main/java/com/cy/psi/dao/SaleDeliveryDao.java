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


    SaleDelivery queryByIdVo(String id);

    SaleDelivery queryById(String deliveryOrderId);
    
    
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
    Integer OutwarehouseAudit(@Param("deliveryState") Integer deliveryState, @Param("deliveryOrderId")String deliveryOrderId);

    //逻辑删除
    Integer DelOutwarehouse(@Param("timeLiness") Integer timeLiness, @Param("deliveryOrderId")String deliveryOrderId);


}