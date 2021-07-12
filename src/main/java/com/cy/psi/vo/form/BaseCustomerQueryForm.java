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
public class BaseCustomerQueryForm implements Serializable {
    private static final long serialVersionUID = -74536128036951629L;

    private Integer customerId;

    private String customerNumber;

    private String customerName;

    private String customerType;

    private Double ratio;

    private String uId;

    private String contact;

    private String contactAddress;

    private String contactNumber;

    private String remarks;

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
