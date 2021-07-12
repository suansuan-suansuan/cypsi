package com.cy.psi.dao;

import com.cy.psi.entity.BaseDepot;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BaseDepotDao {

    int deleteByPrimaryKey(String depotId);

    int insert(BaseDepot record);

    int insertSelective(BaseDepot record);

    BaseDepot selectByPrimaryKey(String depotId);

    int updateByPrimaryKeySelective(BaseDepot record);

    int updateByPrimaryKey(BaseDepot record);

    List<BaseDepot> selectAll();

    List<BaseDepot> selectAll100();
}