package com.cy.psi.vo;

import com.cy.psi.entity.SaleDelivery;
import com.cy.psi.entity.SaleDeliveryDetails;
import lombok.Data;

import java.util.List;

/***
 * @author:
 * @version 1.0
 */
@Data
public class SaleDeliveryVo {
    private SaleDelivery delivery;
    private List<SaleDeliveryDetails> deliverydetails;
    private List<SaleProductVo> saleProductVos;
}
