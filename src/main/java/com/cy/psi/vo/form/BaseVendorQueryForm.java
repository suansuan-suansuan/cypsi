package com.cy.psi.vo.form;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class BaseVendorQueryForm implements Serializable {
    private static final long serialVersionUID = -58520504589930126L;

    private String vendorId;

    private String vendorNumber;

    private String vendorName;

    private String fundAccount;

    private String uId;

    private Double accountsPayable;

    private String contactName;

    private String contactAddress;

    private String contactNumber;

    private String remarks;

    private String productNumber;

    private Integer pageNum;    //当前页
    private Integer pageSize;   //页大小

    public Integer getPageNum() {
        if (pageNum == null)
            return 1;
        return pageNum;
    }

    public Integer getPageSize() {
        if (pageSize == null)
            return 0;
        return pageSize;
    }
}
