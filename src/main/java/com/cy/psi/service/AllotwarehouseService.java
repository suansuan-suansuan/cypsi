package com.cy.psi.service;

import com.cy.psi.entity.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Allotwarehouse)表服务接口
 *
 * @author makejava
 * @since 2021-07-11 11:19:16
 */
public interface AllotwarehouseService {

    //查询仓库
    List<BaseDepot> selectCangku();

    //查询产品
    List<BaseProduct> selectProduct();

    /**
     分页查询全部
     */
    List<Allotwarehouse> selectAllotwarehouse();

    /**
     高级查询
     */
    List<Allotwarehouse> selectBylikeAllotwarehouse(String serialNumber, String documentmaker, String depotName);

    //新增调拨单
    Integer insertAllotwarehouse(Allotwarehouse allotwarehouse);

    //调拨新增出库单
    Integer insertSaleDelivery(SaleDelivery saleDelivery);

    //调拨新增入库单
    Integer insertGoods(Goods goods);

    //调拨单审核
    Integer AllotwarehouseAudit(Integer approval,Integer channelid);

    //逻辑删除
    Integer DelAllotwarehouse( Integer timeLiness,Integer channelid);
}
