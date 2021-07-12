package com.cy.psi.dao;

import com.cy.psi.entity.SaleOrder;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 酸酸
 */
@Mapper
public interface SaleOrderDao {
    int deleteByPrimaryKey(String saleOrderId);

    /**
     *新增销售订单
     * @param record
     * @return
     */
    int insert(SaleOrder record);

    int insertSelective(SaleOrder record);

    SaleOrder selectByPrimaryKey(String saleOrderId);

    int updateByPrimaryKeySelective(SaleOrder record);

    int updateByPrimaryKey(SaleOrder record);

    /**
     * 修改订单
     * @param saleOrder
     */
    void update(SaleOrder saleOrder);

    /**
     * 查询销售单，通过订单号
     * @param id
     * @return
     */
    SaleOrder queryById(String id);
}