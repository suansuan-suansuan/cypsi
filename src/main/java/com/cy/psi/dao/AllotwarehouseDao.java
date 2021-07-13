package com.cy.psi.dao;

import com.cy.psi.entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Allotwarehouse)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-11 11:19:16
 */
@Mapper
public interface AllotwarehouseDao {

    //查询仓库
    List<BaseDepot> selectCangku();

    //查询产品
    List<BaseProduct> selectProduct();

    /**
     查询全部
     */
    List<Allotwarehouse> selectAllotwarehouse();

    /**
     搞鸡查询
     */
    List<Allotwarehouse> selectBylikeAllotwarehouse(@Param("serialNumber") String serialNumber, @Param("documentmaker") String documentmaker, @Param("depotName") String depotName);

    //新增调拨单
    Integer insertAllotwarehouse(Allotwarehouse allotwarehouse);

    //调拨新增出库单
    Integer insertSaleDelivery(SaleDelivery saleDelivery);

    //调拨新增入库单
    Integer insertGoods(Goods goods);
    //调拨单审核
    Integer AllotwarehouseAudit(@Param("approval") Integer approval,@Param("channelid")Integer channelid);

    //逻辑删除
    Integer DelAllotwarehouse(@Param("timeLiness") Integer timeLiness, @Param("channelid")Integer channelid);


}

