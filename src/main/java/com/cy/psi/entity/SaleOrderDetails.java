package com.cy.psi.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * sale_order_details
 * @author 
 */
@Data
public class SaleOrderDetails implements Serializable {
    /**
     * 订单详情表的id

     */
    private Integer id;

    /**
     * 关联销售单id
     */
    private String saleOrderId;

    /**
     * 商品编号
     */
    private String productId;

    /**
     * 商品数量
     */
    private Integer productNum;

    /**
     * 所属仓库id
     */
    private String depot;

    /**
     * 单价（元）
     */
    private BigDecimal saleUnitPrice;

    /**
     * 金额（元）
     */
    private BigDecimal saleMoney;

    private static final long serialVersionUID = 1L;
}