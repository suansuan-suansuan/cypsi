package com.cy.psi.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * GoodsService
 * @author 
 */
@Data
public class Goods implements Serializable {
    /**
     * 退货订单ID
     */
    private Integer goodsId;

    /**
     * 退货时间
     */
    private Date puorderTimestamp;

    /**
     * 审批状态
     */
    private Integer approval;

    /**
     * 退货状态
     */
    private Integer goodsZt;

    /**
     * 审批时间
     */
    private Date apptime;

    /**
     * 退货编号 ：自动生成（xs +时间戳+0001）
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

    private static final long serialVersionUID = 1L;
}