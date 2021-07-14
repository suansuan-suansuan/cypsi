package com.cy.psi.dao;

import com.cy.psi.entity.CypsiPuorder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

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

    int updatePuo(CypsiPuorder record);

    List<CypsiPuorder> selectAll();

    List<CypsiPuorder> selectAllSJ(@Param("Starttime") String Starttime, @Param("Endtime") String Endtime);

    /**
     * 查询供应商供货明细
     * @param map
     * @return
     */
    List<Map<String, Object>> SupplierSupply(Map map);

    /**
     * 采购订单明细
     * @param map
     * @return
     */
    List<Map<String,Object>> PurchaseOrder(Map map);
}