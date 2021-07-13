package com.cy.psi.service;

import com.cy.psi.entity.CypsiPuorder;
import com.cy.psi.entity.Goods;

import java.util.List;

/**
 * @author 皮皮虾
 */
public interface PuorderSerice {

    List<CypsiPuorder> selectAll();

    List<CypsiPuorder> selectAllSJ(String Starttime,String Endtime );

    CypsiPuorder insertPu(CypsiPuorder cypsiPuorder);

    CypsiPuorder updatePuo(CypsiPuorder cypsiPuorder);
}
