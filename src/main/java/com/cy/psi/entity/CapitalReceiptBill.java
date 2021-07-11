package com.cy.psi.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * capital_receipt_bill
 * @author 
 */
@Data
public class CapitalReceiptBill implements Serializable {
    /**
     * 收款单详情的id

     */
    private Integer id;

    /**
     * 关联收款单id

     */
    private String capitalReceiptId;

    /**
     * 结算类型

     */
    private String settlementType;

    /**
     * 本次收款

     */
    private String thisMoney;

    /**
     * 客户id

     */
    private String customer;

    /**
     * 收款人

     */
    private String payee;

    /**
     * 创建人id

     */
    private String founder;

    /**
     * 审批人id

     */
    private String approver;

    /**
     * 创建时间

     */
    private String foundTime;

    /**
     * 更新时间

     */
    private String updateTime;

    /**
     * 审批状态（0为待审批，1为审批通过，2为审批不通过）


     */
    private String approvalState;

    /**
     * 单据批注

     */
    private String remarks;

    private static final long serialVersionUID = 1L;
}