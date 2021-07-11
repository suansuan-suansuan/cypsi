package com.cy.psi.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * base_depot
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseDepot implements Serializable {
    private String depotId;

    private String depotName;

    private String uId;

    private String ontactNumber;

    private String depotAddress;

    private String remarks;

    private Integer state;

    private static final long serialVersionUID = 1L;
}