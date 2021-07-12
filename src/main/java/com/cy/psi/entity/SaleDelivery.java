package com.cy.psi.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * (SaleDelivery)实体类
 *
 * @author makejava
 * @since 2021-07-11 13:51:27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaleDelivery implements Serializable {
    private static final long serialVersionUID = 296948309547737829L;
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
//删除状态
    private Integer timeLiness;


    public String getDeliveryOrderId() {
        return deliveryOrderId;
    }

    public void setDeliveryOrderId(String deliveryOrderId) {
        this.deliveryOrderId = deliveryOrderId;
    }
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getDeliveryOrderTime() {
        return deliveryOrderTime;
    }

    public void setDeliveryOrderTime(Date deliveryOrderTime) {
        this.deliveryOrderTime = deliveryOrderTime;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getSalesmen() {
        return salesmen;
    }

    public void setSalesmen(String salesmen) {
        this.salesmen = salesmen;
    }

    public Double getReceivables() {
        return receivables;
    }

    public void setReceivables(Double receivables) {
        this.receivables = receivables;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver;
    }

    public Date getFoundTime() {
        return foundTime;
    }

    public void setFoundTime(Date foundTime) {
        this.foundTime = foundTime;
    }
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getApprovalTime() {
        return approvalTime;
    }

    public void setApprovalTime(Date approvalTime) {
        this.approvalTime = approvalTime;
    }

    public Integer getApprovalState() {
        return approvalState;
    }

    public void setApprovalState(Integer approvalState) {
        this.approvalState = approvalState;
    }

    public Integer getDeliveryState() {
        return deliveryState;
    }

    public void setDeliveryState(Integer deliveryState) {
        this.deliveryState = deliveryState;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public String getSaleOrderId() {
        return saleOrderId;
    }

    public void setSaleOrderId(String saleOrderId) {
        this.saleOrderId = saleOrderId;
    }

    public Integer getTimeLiness() {
        return timeLiness;
    }

    public void setTimeLiness(Integer timeLiness) {
        this.timeLiness = timeLiness;
    }

}
