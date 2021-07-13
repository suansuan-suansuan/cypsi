package com.cy.psi.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.cy.psi.dao.SaleOrderDetailsDao;
import com.cy.psi.entity.SaleOrderDetails;
import com.cy.psi.service.SaleOrderDetailsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author 酸酸
 */
@Service("SaleOrderDetailsService")
public class SaleOrderDetailsServiceImpl implements SaleOrderDetailsService {
    @Resource
    private SaleOrderDetailsDao saleOrderDetailsDao;
    @Override
    public List<SaleOrderDetails> queryById(String saleOrderId) {
        return this.saleOrderDetailsDao.queryById(saleOrderId);
    }

    @Override
    public void deleteById(String saleOrderId) {
         this.saleOrderDetailsDao.deleteById(saleOrderId);
    }

    @Override
    public void insertBatch(List<SaleOrderDetails> orderdetails) {
        this.saleOrderDetailsDao.insertBatch(orderdetails);
    }

    @Override
    public List<Map<String,Object>> queryByorderId(String id) {
        return this.saleOrderDetailsDao.queryByorderId(id);
    }
}
