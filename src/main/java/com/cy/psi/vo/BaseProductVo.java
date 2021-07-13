package com.cy.psi.vo;

import lombok.Data;

import java.util.Date;
@Data
public class BaseProductVo {
    private static final long serialVersionUID = 283060040475951997L;

    private Integer productId;

    private String productNumber;

    private String productName;

    private Integer unitId;

    private String productSpec;

    private Double purchaseMoney;

    private Double costPrice;

    private Double purchaseUnitPrice;

    private String remarks;

    private Date expiration;

    private Integer state;

    private String vendorNumber;

    private Integer inventoryQuantity;
}
