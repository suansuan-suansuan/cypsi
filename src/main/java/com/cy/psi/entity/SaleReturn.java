package com.cy.psi.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * sale_return
 * @author 
 */
@Data
public class SaleReturn implements Serializable {
    /**
     * 销售退货单号（xsth开头独特辨识字符串）\n
     */
    private String returnOrderId;

    /**
     * 设置当前时间为退货日期

     */
    private Date returnTime;

    /**
     * 客户id
     */
    private String customer;

    /**
     * 销售人员id(当前操作员)

     */
    private String salesmen;

    /**
     * 税后应付款

     */
    private BigDecimal receivables;

    private String remarks;

    /**
     * 审批人id

     */
    private String approver;

    /**
     * 创建时间

     */
    private Date founderTime;

    /**
     * 更新时间

     */
    private Date updateTime;

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
     * 审批状态（0为待审批，1为审批通过，2为审批不通过）
     */
    private Integer approvalState;

    /**
     * 出库状态（0为未出库，1为已出库）

     */
    private Integer deliveryState;

    /**
     * 订单状态（0为执行中，1为已结束）

     */
    private Integer orderState;

    private static final long serialVersionUID = 1L;
}