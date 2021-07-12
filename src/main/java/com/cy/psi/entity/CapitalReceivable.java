package com.cy.psi.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * capital_receivable
 * @author 
 */
@Data
public class CapitalReceivable implements Serializable {
    /**
     * 单据编号
     */
    private String deliveryId;

    /**
     * 单据日期
     */
    private Date deliveryTime;

    /**
     * 客户
     */
    private String customer;

    /**
     * 销售人员
     */
    private String salesmen;

    /**
     * 应收金额
     */
    private Double receivables;

    /**
     * 已收金额
     */
    private Double received;

    /**
     * 未收金额
     */
    private Double uncollected;

    /**
     * 单据备注
     */
    private String remarks;

    /**
     * 结案状态
     */
    private Integer caseState;

    /**
     * 最后收款备注
     */
    private String receiptRemark;

    /**
     * 最后收款时间
     */
    private Date lastCollectionTime;

    private static final long serialVersionUID = 1L;
}