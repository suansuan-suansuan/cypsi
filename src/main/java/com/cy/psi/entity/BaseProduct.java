package com.cy.psi.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * base_product
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BaseProduct implements Serializable {
    private Integer productId;

    private String productNumber;

    private String productName;

    private Integer unitId;

    private String productSpec;

    private BigDecimal purchaseMoney;

    private BigDecimal costPrice;

    private BigDecimal purchaseUnitPrice;

    private String remarks;

    private Date expirationTime;

    private Integer state;

    private String vendorNumber;

    private static final long serialVersionUID = 1L;
}