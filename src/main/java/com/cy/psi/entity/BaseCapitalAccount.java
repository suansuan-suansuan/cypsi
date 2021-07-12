package com.cy.psi.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * base_capital_account
 * @author 
 */
@Data
public class BaseCapitalAccount implements Serializable {
    /**
     * *资金账户编号
     */
    private String capitalId;

    /**
     * *资金账户名称
     */
    private String fundAccount;

    /**
     * *结算类型id
     */
    private Integer settlementTypeId;

    /**
     * *初期金额
     */
    private Double initialAmount;

    /**
     * 当前金额
     */
    private Double currentAmount;

    /**
     * 是否为默认账户: （是：1；否：0）
     */
    private Integer state;

    private static final long serialVersionUID = 1L;
}