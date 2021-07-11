package com.cy.psi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Date;
import java.io.Serializable;

/**
 * (Checkwarehouse)实体类
 *
 * @author makejava
 * @since 2021-07-11 10:12:22
 */
@Data
@NonNull
@AllArgsConstructor
@NoArgsConstructor
public class Checkwarehouse implements Serializable {
    private static final long serialVersionUID = -82302258508444945L;
    /**
     * 盘点id
     */
    private Integer checkid;
    /**
     * 盘点单号
     */
    private String serialNumber;
    /**
     * 制单日期
     */
    private Date documentationDate;
    /**
     * 制单人
     */
    private String documentmaker;
    /**
     * 经手人
     */
    private String operator;
    /**
     * 审核人
     */
    private String auditor;
    /**
     * 审核日期
     */
    private Date audiData;
    /**
     * 单据类型
     */
    private String typeOfDocument;
    /**
     * 说明
     */
    private String explains;
    /**
     * 状态
     */
    private Integer timeliness;
    /**
     * 商品id
     */
    private Integer productId;


    public Integer getCheckid() {
        return checkid;
    }

    public void setCheckid(Integer checkid) {
        this.checkid = checkid;
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

    public Date getAudiData() {
        return audiData;
    }

    public void setAudiData(Date audiData) {
        this.audiData = audiData;
    }

    public String getTypeOfDocument() {
        return typeOfDocument;
    }

    public void setTypeOfDocument(String typeOfDocument) {
        this.typeOfDocument = typeOfDocument;
    }

    public String getExplains() {
        return explains;
    }

    public void setExplains(String explains) {
        this.explains = explains;
    }

    public Integer getTimeliness() {
        return timeliness;
    }

    public void setTimeliness(Integer timeliness) {
        this.timeliness = timeliness;
    }

    public Integer getProductIid() {
        return productId;
    }

    public void setProductIid(Integer timeliness1) {
        this.productId = productId;
    }

}
