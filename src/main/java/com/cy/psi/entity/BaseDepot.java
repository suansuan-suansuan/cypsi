package com.cy.psi.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * base_depot
 * @author 
 */
@Data
public class BaseDepot implements Serializable {
    private String depotId;

    private String depotName;

    private String uId;

    private String ontactNumber;

    private String depotAddress;

    private Integer defaultWarehouse;

    private String remarks;

    private Integer state;

    private static final long serialVersionUID = 1L;
}