package com.cy.psi.dao;

import com.cy.psi.entity.Allotwarehouse;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Allotwarehouse)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-11 11:19:16
 */
@Mapper
public interface AllotwarehouseDao {

    /**
     查询全部
     */
    List<Allotwarehouse> selectAllotwarehouse();

    /**
     搞鸡查询
     */
    List<Allotwarehouse> selectBylikeAllotwarehouse(@Param("serialNumber") String serialNumber, @Param("documentmaker") String documentmaker, @Param("depotName") String depotName);

    //逻辑删除
    Integer DelAllotwarehouse(@Param("timeLiness") Integer timeLiness, @Param("channelid")Integer channelid);


}

