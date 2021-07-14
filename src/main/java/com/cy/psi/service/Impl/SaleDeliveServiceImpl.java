package com.cy.psi.service.Impl;

import com.cy.psi.dao.SaleDeliveryDao;
import com.cy.psi.service.SaleDeliveService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author dfy
 * @date 2021/7/12 8:34
 */
@Service
public class SaleDeliveServiceImpl implements SaleDeliveService {

    @Autowired
    SaleDeliveryDao saleDeliveryDao;

    /**
     * 查询销售商品明细
     * @return
     */
    @Override
    public PageInfo<Map<String, Object>> findStatistical(Map map) {
        PageHelper.startPage((int)map.get("page"),(int)map.get("pageSize"));
        List<Map<String, Object>> maps = saleDeliveryDao.listStatistical(map);
        PageInfo<Map<String, Object>> mapPageInfo = new PageInfo<>(maps);
        return mapPageInfo;
    }

    /**
     * 查询销售订单明细
     * @param map
     * @return
     */
    @Override
    public PageInfo<Map<String, Object>> findStatisticalOrder(Map map) {
        PageHelper.startPage((int)map.get("page"),(int)map.get("pageSize"));
        List<Map<String, Object>> maps = saleDeliveryDao.listStatisticalOrder(map);
        PageInfo<Map<String, Object>> mapPageInfo = new PageInfo<>(maps);
        return mapPageInfo;
    }



    /**
     * 销售毛利明细
     * @param map
     * @return
     */
    @Override
    public PageInfo<Map<String, Object>> findSalesGross(Map map) {
        PageHelper.startPage((int)map.get("page"),(int)map.get("pageSize"));
        List<Map<String, Object>> maps = saleDeliveryDao.listSalesGross(map);
        PageInfo<Map<String, Object>> mapPageInfo = new PageInfo<>(maps);
        return mapPageInfo;
    }

    /**
     * 查询收付款
     *
     * @return
     */
    @Override
    public List<Map<String, Object>> findCollectionAndPayment() {
        List<Map<String, Object>> maps = saleDeliveryDao.CollectionAndPayment();
        return maps;
    }

}
