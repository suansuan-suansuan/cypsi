package com.cy.psi.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * base_unit
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BaseUnit implements Serializable {
    private Integer unitId;

    private String unitName;

    private static final long serialVersionUID = 1L;
}