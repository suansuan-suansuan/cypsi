package com.cy.psi.service;

import java.util.List;
import java.util.Map;

/**
 * @author 酸酸
 */
public interface InventoryService {

    /**
     * 修改库存
     * @param productId
     * @param depot
     * @param productNum
     */
    void expectReduce(String productId, String depot, Integer productNum);

    /**
     * 查询库存明细
     * @param map
     * @return
     */
    List<Map<String,Object>> listProduct(Map map);


     /**添加库存
     * @param productId
     * @param depot
     * @param productNum
     */
    void expectAdd(String productId, String depot, Integer productNum);

    
}
