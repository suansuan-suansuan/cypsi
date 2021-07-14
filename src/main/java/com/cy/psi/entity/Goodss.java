package com.cy.psi.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * Goodss
 * @author 
 */
@Data
public class Goodss implements Serializable {
    /**
     * 采购订单详情表ID
     */
    private Integer puordersId;

    /**
     * 产品名称
     */
    private String puordersName;

    /**
     * 产品单位
     */
    private String puordersUnit;

    /**
     * 产品数量
     */
    private Integer puordersNum;

    /**
     * 产品单价
     */
    private BigDecimal puordersPrice;

    /**
     * 产品外键
     */
    private String productId;

    /**
     * 采购订单总表ID
     */
    private String puorderId;

    private static final long serialVersionUID = 1L;
}