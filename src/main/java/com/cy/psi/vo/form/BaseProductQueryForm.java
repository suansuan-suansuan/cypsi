package com.cy.psi.vo.form;

import java.util.Date;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class BaseProductQueryForm implements Serializable {
    private static final long serialVersionUID = 636015263396174173L;

    private Integer productId;

    private String productNumber;

    private String productName;

    private Integer unitId;

    private String productSpec;

    private Double purchaseMoney;

    private Double costPrice;

    private Double purchaseUnitPrice;

    private String remarks;

    private Date expirationTime;

    private Integer state;

    private String vendorNumber;

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
