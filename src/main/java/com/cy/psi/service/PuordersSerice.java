package com.cy.psi.service;

import com.cy.psi.entity.CypsiPuorder;
import com.cy.psi.entity.Puorders;

import java.util.List;

public interface PuordersSerice {

    void insertPu(Puorders order);

    void insertPuS(CypsiPuorder saleOrder);

    void insertb(List<Puorders> orderdetails);
}
