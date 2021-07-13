package com.cy.psi.dao;

import com.alibaba.fastjson.JSONObject;
import com.cy.psi.entity.SaleOrderDetails;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author 酸酸
 */
@Mapper
public interface SaleOrderDetailsDao {
    int deleteByPrimaryKey(Integer id);

    int insert(SaleOrderDetails record);

    int insertSelective(SaleOrderDetails record);

    SaleOrderDetails selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SaleOrderDetails record);

    int updateByPrimaryKey(SaleOrderDetails record);

    /**
     * 通过订单ID查询单条数据
     * @param saleOrderId
     * @return
     */
    List<SaleOrderDetails> queryById(String saleOrderId);

    /**
     * 通过销售订单号删除详情表
     * @param saleOrderId
     */
    void deleteById(String saleOrderId);

    /**
     * 新增多条数据
     * @param orderdetails
     */
    void insertBatch(@Param("entities") List<SaleOrderDetails> orderdetails);

    List<Map<String,Object>> queryByorderId(String id);
}