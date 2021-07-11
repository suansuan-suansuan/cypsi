package com.cy.psi.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * capital_receipt_account
 * @author 
 */
@Data
public class CapitalReceiptAccount implements Serializable {
    /**
     * 账户表的id
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
     * 资金账户id

     */
    private String fundAccount;

    /**
     * 本次收款

     */
    private String thisMoney;

    private static final long serialVersionUID = 1L;
}