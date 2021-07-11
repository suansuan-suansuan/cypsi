package com.cy.psi.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * inventory
 * @author 
 */
@Data
public class Inventory implements Serializable {
    private String inventoryId;

    private String depotId;

    private String depotName;

    private Integer productId;

    private String productName;

    private BigDecimal purchaseUnitPrice;

    private BigDecimal purchaseMoney;

    private Integer inventoryQuantity;

    private String totalCost;

    private Integer vendorId;

    private String vendorName;

    private static final long serialVersionUID = 1L;
}