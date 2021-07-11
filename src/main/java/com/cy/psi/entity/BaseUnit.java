package com.cy.psi.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * base_unit
 * @author 
 */
@Data
public class BaseUnit implements Serializable {
    private Integer unitId;

    private String unitName;

    private static final long serialVersionUID = 1L;
}