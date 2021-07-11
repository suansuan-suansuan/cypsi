package com.cy.psi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serializable;

/**
 * (BaseDepot)实体类
 *
 * @author makejava
 * @since 2021-07-11 11:26:09
 */
@Data
@NonNull
@AllArgsConstructor
@NoArgsConstructor
public class BaseDepot implements Serializable {
    private static final long serialVersionUID = -35327283677228253L;

    private String depotId;

    private String depotName;

    private String uId;

    private String ontactNumber;

    private String depotAddress;

    private Integer defaultWarehouse;

    private String remarks;

    private Integer state;


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

    public String getUId() {
        return uId;
    }

    public void setUId(String uId) {
        this.uId = uId;
    }

    public String getOntactNumber() {
        return ontactNumber;
    }

    public void setOntactNumber(String ontactNumber) {
        this.ontactNumber = ontactNumber;
    }

    public String getDepotAddress() {
        return depotAddress;
    }

    public void setDepotAddress(String depotAddress) {
        this.depotAddress = depotAddress;
    }

    public Integer getDefaultWarehouse() {
        return defaultWarehouse;
    }

    public void setDefaultWarehouse(Integer defaultWarehouse) {
        this.defaultWarehouse = defaultWarehouse;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

}
