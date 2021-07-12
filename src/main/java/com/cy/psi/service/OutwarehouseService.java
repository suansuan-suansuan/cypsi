package com.cy.psi.service;

import com.cy.psi.entity.SaleDelivery;

import java.util.List;

/**
 * (SaleDelivery)表服务接口
 *
 * @author makejava
 * @since 2021-07-11 14:16:37
 */
public interface OutwarehouseService {

    /**
     分页查询全部
     */
    List<SaleDelivery> selectOutwarehouse();

    /**
     高级查询
     */
    List<SaleDelivery> selectBylikeOutwarehouse(String Starttime, String Endtime, String salesmen, String remarks);

    //审核   出库单
    Integer OutwarehouseAudit( Integer deliveryState,String deliveryOrderId);


    /**
     * 通过主键删除数据
     *
     * @param deliveryOrderId 主键
     * @return 是否成功
     */
    boolean deleteById(String deliveryOrderId);

}
