package com.cy.psi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (Inventory)实体类
 *
 * @author makejava
 * @since 2021-07-11 15:23:34
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Inventory implements Serializable {
    private static final long serialVersionUID = 238569478249922232L;

    private String inventoryId;
    // 仓库
    private BaseDepot baseDepot;
    private String depotId;

    private String depotName;

    // 产品
    private BaseProduct baseProduct;
    private Integer productId;

    private String productName;

    private Double purchaseUnitPrice;

    private Double purchaseMoney;

    private Integer inventoryQuantity;

    private String totalCost;

    private Integer vendorId;

    private String vendorName;


    public String getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(String inventoryId) {
        this.inventoryId = inventoryId;
    }

    public String getDepotId() {
        return depotId;
    }

    public void setDepotId(String depotId) {
        this.depotId = depotId;
    }

    public String getDepotName() {
        return depotName;
    }

    public void setDepotName(String depotName) {
        this.depotName = depotName;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPurchaseUnitPrice() {
        return purchaseUnitPrice;
    }

    public void setPurchaseUnitPrice(Double purchaseUnitPrice) {
        this.purchaseUnitPrice = purchaseUnitPrice;
    }

    public Double getPurchaseMoney() {
        return purchaseMoney;
    }

    public void setPurchaseMoney(Double purchaseMoney) {
        this.purchaseMoney = purchaseMoney;
    }

    public Integer getInventoryQuantity() {
        return inventoryQuantity;
    }

    public void setInventoryQuantity(Integer inventoryQuantity) {
        this.inventoryQuantity = inventoryQuantity;
    }

    public String getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost;
    }

    public Integer getVendorId() {
        return vendorId;
    }

    public void setVendorId(Integer vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

}
