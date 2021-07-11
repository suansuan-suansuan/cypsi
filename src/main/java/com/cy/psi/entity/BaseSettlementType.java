package com.cy.psi.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * base_settlement_type
 * @author 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BaseSettlementType implements Serializable {
    private Integer settlementTypeId;

    private String settlementType;

    private static final long serialVersionUID = 1L;
}