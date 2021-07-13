package com.cy.psi.service.Impl;

import com.cy.psi.entity.*;
import com.cy.psi.dao.AllotwarehouseDao;
import com.cy.psi.service.AllotwarehouseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Allotwarehouse)表服务实现类
 *
 * @author makejava
 * @since 2021-07-11 11:19:16
 */
@Service
public class AllotwarehouseServiceImpl implements AllotwarehouseService {
    @Resource
    private AllotwarehouseDao allotwarehouseDao;
    //查询仓库
    @Override
    public List<BaseDepot> selectCangku() {
        return allotwarehouseDao.selectCangku();
    }
    //查询产品
    @Override
    public List<BaseProduct> selectProduct() {
        return allotwarehouseDao.selectProduct();
    }

    /**
     分页查询所有
     */
    @Override
    public List<Allotwarehouse> selectAllotwarehouse() {
        return allotwarehouseDao.selectAllotwarehouse();
    }

    /**
     高级查询
     */
    @Override
    public List<Allotwarehouse> selectBylikeAllotwarehouse(String serialNumber, String documentmaker, String depotName) {
        return allotwarehouseDao.selectBylikeAllotwarehouse(serialNumber,documentmaker,depotName);
    }

    //新增调拨单
    @Override
    public Integer insertAllotwarehouse(Allotwarehouse allotwarehouse) {
        return allotwarehouseDao.insertAllotwarehouse(allotwarehouse);
    }

    //调拨新增出库单
    @Override
    public Integer insertSaleDelivery(SaleDelivery saleDelivery) {
        return allotwarehouseDao.insertSaleDelivery(saleDelivery);
    }

    //调拨新增入库单
    @Override
    public Integer insertGoods(Goods goods) {
        return allotwarehouseDao.insertGoods(goods);
    }

    //调拨单审核
    @Override
    public Integer AllotwarehouseAudit( Integer approval,Integer channelid){
        return allotwarehouseDao.AllotwarehouseAudit(approval,channelid);
    }

    //逻辑删除
    @Override
    public Integer DelAllotwarehouse( Integer timeLiness,Integer channelid){
        return allotwarehouseDao.DelAllotwarehouse(timeLiness,channelid);
    }


}
