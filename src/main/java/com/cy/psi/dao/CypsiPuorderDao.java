package com.cy.psi.dao;

import com.cy.psi.entity.CypsiPuorder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 皮皮虾
 */
@Mapper
public interface CypsiPuorderDao {
    int deleteByPrimaryKey(Integer puorderId);

    int insertPu(CypsiPuorder record);

    int insertSelective(CypsiPuorder record);

    CypsiPuorder selectByPrimaryKey(Integer puorderId);

    int updateByPrimaryKeySelective(CypsiPuorder record);

    int updateByPrimaryKey(CypsiPuorder record);

    List<CypsiPuorder> selectAll();

    List<CypsiPuorder> selectAllSJ(@Param("Starttime") String Starttime, @Param("Endtime") String Endtime);

}