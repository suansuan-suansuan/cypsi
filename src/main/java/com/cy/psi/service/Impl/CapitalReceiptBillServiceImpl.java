package com.cy.psi.service.Impl;

import com.cy.psi.dao.CapitalReceiptBillDao;
import com.cy.psi.entity.CapitalReceiptBill;
import com.cy.psi.service.CapitalReceiptBillService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
/**
 * @author
 */
@Service("CapitalReceiptBillService")
public class CapitalReceiptBillServiceImpl implements CapitalReceiptBillService {
    @Resource
    private CapitalReceiptBillDao capitalReceiptBillDao;
    @Override
    public List<CapitalReceiptBill> relation(String id) {
        return this.capitalReceiptBillDao.relation(id);
    }
}
