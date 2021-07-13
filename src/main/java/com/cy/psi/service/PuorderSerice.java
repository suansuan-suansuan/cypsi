package com.cy.psi.service;

import com.cy.psi.entity.CypsiPuorder;
import com.cy.psi.entity.Goods;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

/**
 * @author 皮皮虾
 */
public interface PuorderSerice {

    List<CypsiPuorder> selectAll();

    List<CypsiPuorder> selectAllSJ(String Starttime,String Endtime );

    CypsiPuorder insertPu(CypsiPuorder cypsiPuorder);

    /**
     * 查询供应商供货明细
     * @param map
     * @return
     */
    PageInfo<Map<String, Object>> findSupplierSupply(Map map);

    /**
     * 查询采购明细
     * @param map
     * @return
     */
    PageInfo<Map<String, Object>> PurchaseOrder(Map map);

}
