package com.cy.psi.service;

import com.cy.psi.entity.BaseDepot;
import com.cy.psi.entity.BaseProduct;

import java.util.List;

public interface BaseDepotService  {

    /**
     * 分页查询仓库数据
     * @return
     */
    List<BaseDepot> SelectAll();

    List<BaseDepot> selectAll100();
}
