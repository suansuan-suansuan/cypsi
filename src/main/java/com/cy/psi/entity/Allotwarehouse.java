package com.cy.psi.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Date;
import java.io.Serializable;

/**
 * (Allotwarehouse)实体类
 *
 * @author makejava
 * @since 2021-07-11 11:19:16
 */
@Data
@NonNull
@AllArgsConstructor
@NoArgsConstructor
public class Allotwarehouse implements Serializable {
    private static final long serialVersionUID = 307242751778899293L;

    private Integer channelid;

    private String serialNumber;

    private Date documentationDate;

    private String documentmaker;

    //仓库
    private BaseDepot basedepot;
    private Integer depotId;

    private String transferredtothewarehouse;
    private String bringupthewarehouse;

    private String operator;

    private String auditor;

    private Date auditData;

    private String auditSign;

    private Integer timeliness;

    private Integer productId;
    private Integer approval;

    //删除状态
    private Integer timeLiness;


    public Integer getChannelid() {
        return channelid;
    }

    public void setChannelid(Integer channelid) {
        this.channelid = channelid;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getDocumentationDate() {
        return documentationDate;
    }

    public void setDocumentationDate(Date documentationDate) {
        this.documentationDate = documentationDate;
    }

    public String getDocumentmaker() {
        return documentmaker;
    }

    public void setDocumentmaker(String documentmaker) {
        this.documentmaker = documentmaker;
    }

    public Integer getDepotId() {
        return depotId;
    }

    public void setDepotId(Integer depotId) {
        this.depotId = depotId;
    }
    public String getbringupthewarehouse() {
        return bringupthewarehouse;
    }

    public void setBringupthewarehouse(String bringupthewarehouse) {
        this.bringupthewarehouse = bringupthewarehouse;
    }

    public String getTransferredtothewarehouse() {
        return transferredtothewarehouse;
    }

    public void setTransferredtothewarehouse(String transferredtothewarehouse) {
        this.transferredtothewarehouse = transferredtothewarehouse;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getAuditData() {
        return auditData;
    }

    public void setAuditData(Date auditData) {
        this.auditData = auditData;
    }

    public String getAuditSign() {
        return auditSign;
    }

    public void setAuditSign(String auditSign) {
        this.auditSign = auditSign;
    }

    public Integer getTimeliness() {
        return timeliness;
    }

    public void setTimeliness(Integer timeliness) {
        this.timeliness = timeliness;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getTimeLiness() {
        return timeLiness;
    }

    public void setTimeLiness(Integer timeLiness) {
        this.timeLiness = timeLiness;
    }

    public Integer getApproval() {
        return approval;
    }

    public void setApproval(Integer approval) {
        this.approval = approval;
    }

}
