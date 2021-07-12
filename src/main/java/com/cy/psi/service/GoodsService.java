package com.cy.psi.service;

import com.cy.psi.entity.Goods;
import com.cy.psi.entity.SaleDelivery;

import java.util.List;

/**
 * @author 皮皮虾
 */
public interface GoodsService {

    List<Goods> GoselectAll();


//=============================我唐某的地盘=====================================================================

    List<Goods> GoselectAll2();

    /**
     高级查询
     */
    List<Goods> selectBylikeGoods(String Starttime, String Endtime, String goodsZt, Integer goodsState);

    //审核   出库单
    Integer GoodsAudit( Integer goodsZt,String puorderTimestamp,Integer goodsId);

    //逻辑删除
    Integer DelGoods( Integer timeLiness,Integer goodsId);

}
