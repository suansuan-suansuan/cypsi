package com.cy.psi.dao;

import com.cy.psi.entity.CypsiPuorder;
import com.cy.psi.entity.Puorders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Mapper
public interface PuordersDao {
    int deleteByPrimaryKey(Integer puordersId);


    int insertPu(@Param("entities") List<Puorders> record);

    int insertSelective(Puorders record);

    Puorders selectByPrimaryKey(Integer puordersId);

    int updateByPrimaryKeySelective(Puorders record);

    int updateByPrimaryKey(Puorders record);
}