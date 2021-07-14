package com.cy.psi.entity;

import java.util.Date;
import java.math.BigDecimal;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * (BaseProduct)实体类
 *
 * @author makejava
 * @since 2021-07-12 23:10:24
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class BaseProduct implements Serializable {
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
}
