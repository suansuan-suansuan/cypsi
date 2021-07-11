package com.cy.psi.entity;

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

    private String operator;

    private String auditor;

    private Date auditData;

    private String auditSign;

    private Integer timeliness;

    private Integer productId;


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

}
