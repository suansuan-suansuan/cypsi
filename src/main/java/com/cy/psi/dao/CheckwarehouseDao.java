package com.cy.psi.dao;


import com.cy.psi.entity.Checkwarehouse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * (Checkwarehouse)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-11 10:12:24
 */
@Mapper
public interface CheckwarehouseDao {
    /**
     查询全部
     */
    List<Checkwarehouse> selectCheckwarehouse();


    /**
     * 通过主键删除数据
     *
     * @param checkid 主键
     * @return 影响行数
     */
    int deleteById(Integer checkid);

}

