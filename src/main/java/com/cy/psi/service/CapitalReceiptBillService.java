package com.cy.psi.service;

import com.cy.psi.entity.CapitalReceiptBill;

import java.util.List;

/**
 * @author
 */
public interface CapitalReceiptBillService {
    /**
     * 通过ID查询关联单据
     *
     * @param id 主键
     * @return 实例对象
     */
    List<CapitalReceiptBill> relation(String id);
}
