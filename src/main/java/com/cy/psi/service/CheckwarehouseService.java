package com.cy.psi.service;



import com.cy.psi.entity.Checkwarehouse;

import java.util.List;

/**
 * (Checkwarehouse)表服务接口
 *
 * @author makejava
 * @since 2021-07-11 10:12:24
 */
public interface CheckwarehouseService {
    //查询
    List<Checkwarehouse> selectCheckwarehouse();
   //删除
    boolean deleteById(Integer checkid);

}
