package com.cy.psi.dao;

import com.cy.psi.entity.SaleDelivery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

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

    /**
     * 查询全部
     */
    List<SaleDelivery> selectOutwarehouse();

    /**
     * 搞鸡查询
     */
    List<SaleDelivery> selectBylikeOutwarehouse(@Param("Starttime") String Starttime, @Param("Endtime") String Endtime, @Param("salesmen") String salesmen, @Param("remarks") String remarks);


    //审核    出库单
    Integer OutwarehouseAudit(@Param("deliveryState") Integer deliveryState, @Param("deliveryOrderId")String deliveryOrderId);


    /**
     * 通过主键删除数据
     *
     * @param deliveryOrderId 主键
     * @return 影响行数
     */
    int deleteById(String deliveryOrderId);

    /**
     *查询销售商品明细
     * @return
     */
    List<Map<String,Object>> listStatistical(Map map);

    /**
     *查询销售订单明细
     * @return
     */
    List<Map<String,Object>> listStatisticalOrder(Map map);

    /**
     *查询前十畅销商品
     * @return
     */
    List<Map<String,Object>> listStatisticalProduct();

    /**
     * 销售毛利明细表
     * @param map
     * @return
     */
    List<Map<String,Object>> listSalesGross(Map map);

    SaleDelivery queryByIdVo(String id);

    SaleDelivery queryById(String deliveryOrderId);
}