package com.cy.psi.dao;

import com.cy.psi.entity.SysMenu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author Twx
 * @Date 2021/7/12 21:58
 * @Description 菜单数据访问层
 * @Since version-1.0
 */
@Repository
@Mapper
public interface SysMenuDao {
    int deleteByPrimaryKey(String menuId);

    int insert(SysMenu record);

    int insertSelective(SysMenu record);

    SysMenu selectByPrimaryKey(String menuId);

    int updateByPrimaryKeySelective(SysMenu record);

    int updateByPrimaryKey(SysMenu record);

    List<SysMenu> selectAllMenu();
}