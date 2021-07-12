package com.cy.psi.service;

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
     *添加库存
     * @param productId
     * @param depot
     * @param productNum
     */
    void expectAdd(String productId, String depot, Integer productNum);
}
