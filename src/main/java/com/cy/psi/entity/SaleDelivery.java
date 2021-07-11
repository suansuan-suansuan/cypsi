package com.cy.psi.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * sale_delivery
 * @author 
 */
@Data
public class SaleDelivery implements Serializable {
    /**
     * 销售出库单号（xsck开头独特辨识字符串）
     */
    private String deliveryOrderId;

    /**
     * 设置当前时间为出货日期

     */
    private Date deliveryOrderTime;

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
    private BigDecimal receivables;

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
    private Date foundTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 审批时间
     */
    private Date approvalTime;

    /**
     * 审批状态（0为待审批，1为审批通过，2为审批不通过）\n
     */
    private Integer approvalState;

    /**
     * 出库状态（0为未出库，1为已出库）\n
     */
    private Integer deliveryState;

    /**
     * 订单状态（0为执行中，1为已结束，出库单和收款单审批通过后为已结束）
     */
    private Integer orderState;

    /**
     * 关联销售单id
     */
    private String saleOrderId;

    private static final long serialVersionUID = 1L;
}