package com.cy.psi.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * CYpsi_Puorder
 * @author 
 */
@Data
public class CypsiPuorder implements Serializable {
    /**
     * 采购订单ID
     */
    private Integer puorderId;

    /**
     * 采购订单时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date puorderTimestamp;

    /**
     * 仓库名
     */
    private String puorderC;

    /**
     * 审批状态
     */
    private Integer approval;

    /**
     * 最后审批时间
     */
    private Date apptime;

    /**
     * 采购员
     */
    private String puorderCg;

    /**
     * 采购订单编号 ：自动生成（xs +时间戳+0001）
     */
    private String puorderState;

    /**
     * 订单金额
     */
    private BigDecimal puorderTotal;

    /**
     * 说明
     */
    private String explain;

    /**
     * 供应商名称
     */
    private String puorderG;

    /**
     * 仓库ID
     */
    private String depotId;

    /**
     * 供应商ID
     */
    private String vendorId;

    private static final long serialVersionUID = 1L;
}