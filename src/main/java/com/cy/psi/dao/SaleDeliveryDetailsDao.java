package com.cy.psi.dao;

import com.cy.psi.entity.SaleDeliveryDetails;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 酸酸
 */
@Mapper
public interface SaleDeliveryDetailsDao {
    int deleteByPrimaryKey(Integer id);

    int insert(SaleDeliveryDetails record);

    int insertSelective(SaleDeliveryDetails record);

    SaleDeliveryDetails selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SaleDeliveryDetails record);

    int updateByPrimaryKey(SaleDeliveryDetails record);

    List<SaleDeliveryDetails> queryById(String id);

    /**
     * 1
     * @param deliverydetails
     */
    void insertBatch(@Param("entities") List<SaleDeliveryDetails> deliverydetails);
}