package com.cy.psi.service;

import com.github.pagehelper.PageInfo;

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
    PageInfo<Map<String,Object>> findProduct(Map map);

    /**
     * 库存商品报警
     * @param map
     * @return
     */
    PageInfo<Map<String,Object>> findInventoryAlarm(Map map);


    /**
     * 查询过期商品
     * @param map
     * @return
     */
    PageInfo<Map<String,Object>> findGoodOut(Map map);


     /**添加库存
     * @param productId
     * @param depot
     * @param productNum
     */
    void expectAdd(String productId, String depot, Integer productNum);

    
}
