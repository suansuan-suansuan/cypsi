package com.cy.psi.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * base_customer
 * @author 
 */
@Data
public class BaseCustomer implements Serializable {
    private Integer customerId;

    private String customerNumber;

    private String customerName;

    private String customerType;

    private BigDecimal ratio;

    private String uId;

    private String contact;

    private String contactAddress;

    private String contactNumber;

    private String remarks;

    private static final long serialVersionUID = 1L;
}