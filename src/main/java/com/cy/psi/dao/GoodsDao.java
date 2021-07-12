package com.cy.psi.dao;

import com.cy.psi.entity.CypsiPuorder;
import com.cy.psi.entity.Goods;
import com.cy.psi.entity.SaleDelivery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GoodsDao {
    int deleteByPrimaryKey(Integer goodsId);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer goodsId);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

    List<Goods> GoselectAll();


//    =====================================我唐某的地盘=========================================================================

    List<Goods> GoselectAll2();
    /**
     搞鸡查询
     */
    List<Goods> selectBylikeGoods(@Param("Starttime") String Starttime, @Param("Endtime") String Endtime, @Param("goodsZt") String goodsZt, @Param("goodsState") Integer goodsState);

    //审核    出库单
    Integer GoodsAudit(@Param("goodsZt") Integer goodsZt, @Param("puorderTimestamp")String puorderTimestamp, @Param("goodsId")Integer goodsId);

}