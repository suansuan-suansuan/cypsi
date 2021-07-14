package com.cy.psi.service.Impl;

import com.cy.psi.dao.GoodsDao;
import com.cy.psi.entity.Goods;
import com.cy.psi.entity.SaleDelivery;
import com.cy.psi.service.GoodsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 皮皮虾
 */

@Slf4j
@Service
public class GoodsServiceImpl implements GoodsService {
    @Resource
    private GoodsDao goodsDao;

    @Override
    public List<Goods> GoselectAll() {
        log.debug("查询所有");
        return goodsDao.GoselectAll();
    }

//=========================================我唐某的地盘===========================================================

    @Override
    public List<Goods> GoselectAll2() {
        log.debug("查询所有");
        return goodsDao.GoselectAll2();
    }
    /**
     高级查询
     */
    @Override
    public List<Goods> selectBylikeGoods(String Starttime, String Endtime, String goodsZt, Integer goodsState) {
        return goodsDao.selectBylikeGoods(Starttime,Endtime,goodsZt,goodsState);
    }

    //审核   出库单
    @Override
    public Integer GoodsAudit( Integer goodsZt,Integer goodsId){
        return goodsDao.GoodsAudit(goodsZt,goodsId);
    }
    //修改   删除
    @Override
    public Integer DelGoods( Integer timeLiness,Integer goodsId){
        return goodsDao.DelGoods(timeLiness,goodsId);
    }

}
