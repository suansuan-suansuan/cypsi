package com.cy.psi.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * sale_order
 * @author 
 */
@Data
public class SaleOrder implements Serializable {
    /**
     * 销售单号（xsdd开头独特辨识字符串）
     */
    private String saleOrderId;

    /**
     * 当前时间作为单据日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date saleOrderTime;

    /**
     * 客户id
     */
    private String customer;

    /**
     * 销售人员id(当前登录用户)
     */
    private String salesmen;

    /**
     * 税后应收款
     */
    private Double receivables;

    /**
     * 单据批注
     */
    private String remarks;

    /**
     * 审批人
     */
    private String approver;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date foundTime;

    /**
     * 修改时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updateTime;

    /**
     * 审批时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date approvalTime;

    /**
     * 审批状态（0为待审批，1为审批通过，2为审批不通过）

     */
    private Integer approvalState;

    /**
     * 出库状态（0为未出库，1为已出库）

     */
    private Integer deliveryState;

    /**
     * 订单状态（0为执行中，1为已结束，出库单和收款单审批通过后为已结束）
     */
    private Integer orderState;

    private Date deliveryTime;

    /**
     * 客户交的预收款
     */
    private Double advance;
    private static final long serialVersionUID = 1L;
}