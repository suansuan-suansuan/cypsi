package com.cy.psi.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * base_settlement_type
 * @author 
 */
@Data
public class BaseSettlementType implements Serializable {
    private Integer settlementTypeId;

    private String settlementType;

    private static final long serialVersionUID = 1L;
}