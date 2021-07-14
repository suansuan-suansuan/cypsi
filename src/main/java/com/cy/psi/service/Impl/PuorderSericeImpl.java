package com.cy.psi.service.Impl;

import com.cy.psi.dao.CypsiPuorderDao;
import com.cy.psi.entity.CypsiPuorder;
import com.cy.psi.entity.Goods;
import com.cy.psi.service.PuorderSerice;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author 皮皮虾
 */
@Slf4j
@Service
public class PuorderSericeImpl implements PuorderSerice {

    @Resource
    private CypsiPuorderDao cypsiPuorderDao;

    @Override
    public List<CypsiPuorder> selectAll() {
        log.debug("查询所有");
        return cypsiPuorderDao.selectAll();
    }

    @Override
    public List<CypsiPuorder> selectAllSJ(String Starttime, String Endtime) {
        return cypsiPuorderDao.selectAllSJ(Starttime, Endtime);
    }

    @Override
    public CypsiPuorder insertPu(CypsiPuorder cypsiPuorder) {
        String num = "CG";//定义一个固定值
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");//时间的精确值
        String feesname = num + dateFormat.format(new Date()) + cypsiPuorder.toString().length();
        cypsiPuorder.setPuorderState(feesname);
        cypsiPuorderDao.insertPu(cypsiPuorder);
        return cypsiPuorder;
    }

    /**
     * 查询供应商供货明细
     *
     * @param map
     * @return
     */
    @Override
    public PageInfo<Map<String, Object>> findSupplierSupply(Map map) {
        PageHelper.startPage((int) map.get("page"), (int) map.get("pageSize"));
        List<Map<String, Object>> maps = cypsiPuorderDao.SupplierSupply(map);
        PageInfo<Map<String, Object>> mapPageInfo = new PageInfo<>(maps);
        return mapPageInfo;
    }

    /**
     * 查询采购订单明细
     *
     * @param map
     * @return
     */
    @Override
    public PageInfo<Map<String, Object>> findPurchaseOrder(Map map) {
        PageHelper.startPage((int) map.get("page"), (int) map.get("pageSize"));
        List<Map<String, Object>> maps = cypsiPuorderDao.PurchaseOrder(map);
        PageInfo<Map<String, Object>> mapPageInfo = new PageInfo<>(maps);
        return mapPageInfo;
    }

    @Override
    public CypsiPuorder updatePuo(CypsiPuorder cypsiPuorder) {
        log.debug("修改到了");
        cypsiPuorderDao.updatePuo(cypsiPuorder);
        return cypsiPuorder;
    }
}
