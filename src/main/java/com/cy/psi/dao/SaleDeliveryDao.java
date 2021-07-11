package com.cy.psi.dao;

import com.cy.psi.entity.SaleDelivery;
import org.apache.ibatis.annotations.Mapper;

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
}