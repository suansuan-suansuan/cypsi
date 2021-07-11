package com.cy.psi.service.Impl;

import com.cy.psi.dao.SaleDeliveryDao;
import com.cy.psi.entity.SaleDelivery;
import com.cy.psi.service.OutwarehouseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SaleDelivery)表服务实现类
 *
 * @author makejava
 * @since 2021-07-11 14:16:38
 */
//@Service("saleDeliveryService")
public class OutwarehouseServiceImpl implements OutwarehouseService {
    @Resource
    private SaleDeliveryDao saleDeliveryDao;

    /**
     分页查询所有
     */
    @Override
    public List<SaleDelivery> selectOutwarehouse() {
        return saleDeliveryDao.selectOutwarehouse();
    }

    /**
     高级查询
     */
    @Override
    public List<SaleDelivery> selectBylikeOutwarehouse(String Starttime, String Endtime, String remarks) {
        return saleDeliveryDao.selectBylikeOutwarehouse(Starttime,Endtime,remarks);
    }

    //审核   出库单
    @Override
    public Integer OutwarehouseAudit( Integer approvalState,Integer deliveryOrderId){
        return saleDeliveryDao.OutwarehouseAudit(approvalState,deliveryOrderId);
    }

    /**
     * 通过主键删除数据
     *
     * @param deliveryOrderId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String deliveryOrderId) {
        return this.saleDeliveryDao.deleteById(deliveryOrderId) > 0;
    }
}
