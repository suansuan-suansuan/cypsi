package com.cy.psi.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * base_vendor
 * @author 
 */
@Data
public class BaseVendor implements Serializable {
    private String vendorId;

    private String vendorNumber;

    private String vendorName;

    private String fundAccount;

    private String uId;

    private BigDecimal accountsPayable;

    private String contactName;

    private String contactAddress;

    private String contactNumber;

    private String remarks;

    private static final long serialVersionUID = 1L;
}