package com.cy.psi.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * capital_receipt
 * @author 
 */
@Data
public class CapitalReceipt implements Serializable {
    /**
     * 收款单号（sk开头独特辨识字符串）
     */
    private String capitalReceiptId;

    /**
     * 设置当前时间为收款日期
     */
    private Date capitalReceiptTime;

    /**
     * 客户id
     */
    private String customer;

    /**
     * 收款人员id
     */
    private String capitalReceiptMen;

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
     * 关联退货单id
     */
    private String returnOrderId;

    /**
     * 关联销售出库单id
     */
    private String deliveryOrderId;

    /**
     * 关联销售单id
     */
    private String saleOrderId;

    /**
     * 审批时间
     */
    private Date approvalTime;

    /**
     * 审批状态（0为待审批，1为审批通过，2为审批不通过
     */
    private Integer approvalState;

    /**
     * 订单状态（0为执行中，1为已结束)
     */
    private Integer orderState;

    private static final long serialVersionUID = 1L;
}