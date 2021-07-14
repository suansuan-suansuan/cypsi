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
public class BaseDepotQueryForm implements Serializable {
    private static final long serialVersionUID = 740089199046106874L;

    private String depotId;

    private String depotName;

    private String uId;

    private String ontactNumber;

    private String depotAddress;

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
