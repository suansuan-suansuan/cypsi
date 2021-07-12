package com.cy.psi.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * GoodsService
 * @author 
 */
@Data
public class Goods implements Serializable {
    /**
     * 入库订单ID
     */
    private Integer goodsId;

    /**
     * 入库时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date puorderTimestamp;

    /**
     * 审批状态
     */
    private Integer approval;

    /**
     * 入库状态
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Integer goodsZt;

    /**
     * 审批时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date apptime;

    /**
     * 入库编号 ：自动生成（xs +时间戳+0001）
     */
    private String goodsState;

    /**
     * 说明
     */
    private String explain;

    /**
     * 仓库ID
     */
    private String depotId;

    /**
     * 采购订单
     */
    private String puorderId;
//删除状态
    private Integer timeLiness;

    private static final long serialVersionUID = 1L;
}