package com.cy.psi.vo;

import com.cy.psi.entity.SaleOrder;
import com.cy.psi.entity.SaleOrderDetails;
import lombok.Data;

import java.util.List;

/***
 * @author: 顾渊白
 * @date: 2021/5/20 19:04
 * @version 1.0
 */
@Data
public class SaleOrderVo {
    private SaleOrder order;
    private List<SaleOrderDetails> orderdetails;
    private List<SaleProductVo> saleProductVos;
}
