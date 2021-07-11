package com.cy.psi.service;

import com.cy.psi.entity.Allotwarehouse;

import java.util.List;

/**
 * (Allotwarehouse)表服务接口
 *
 * @author makejava
 * @since 2021-07-11 11:19:16
 */
public interface AllotwarehouseService {
    /**
     分页查询全部
     */
    List<Allotwarehouse> selectAllotwarehouse();

    /**
     高级查询
     */
    List<Allotwarehouse> selectBylikeAllotwarehouse(String serialNumber, String documentmaker, String depotName);


    /**
     * 通过主键删除数据
     *
     * @param channelid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer channelid);

}
