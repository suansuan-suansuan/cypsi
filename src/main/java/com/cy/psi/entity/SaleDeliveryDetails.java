package com.cy.psi.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * sale_delivery_details
 * @author 
 */
@Data
public class SaleDeliveryDetails implements Serializable {
    /**
     * 订单详情表的id
     */
    private Integer id;

    /**
     * 关联出库单id
     */
    private String deliveryOrderId;

    /**
     * 商品编号
     */
    private String productId;

    /**
     * 商品数量

     */
    private Integer productNum;

    /**
     * 所属仓库

     */
    private String depotId;

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