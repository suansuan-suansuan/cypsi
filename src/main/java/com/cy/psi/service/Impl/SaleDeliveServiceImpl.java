package com.cy.psi.service.Impl;

import com.cy.psi.dao.SaleDeliveryDao;
import com.cy.psi.service.SaleDeliveService;
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
    public List<Map<String, Object>> listStatistical(Map map) {
        List<Map<String, Object>> maps = saleDeliveryDao.listStatistical(map);
        return maps;
    }

    /**
     * 查询销售订单明细
     * @param map
     * @return
     */
    @Override
    public List<Map<String, Object>> listStatisticalOrder(Map map) {
        List<Map<String, Object>> maps = saleDeliveryDao.listStatisticalOrder(map);
        return maps;
    }

    /**
     * 前十畅销商品
     * @return
     */
    @Override
    public List<Map<String, Object>> listStatisticalProduct() {
        List<Map<String, Object>> maps = saleDeliveryDao.listStatisticalProduct();
        return maps;
    }

    /**
     * 销售毛利明细
     * @param map
     * @return
     */
    @Override
    public List<Map<String, Object>> listSalesGross(Map map) {
        List<Map<String, Object>> maps = saleDeliveryDao.listSalesGross(map);
        return maps;
    }


}
