package com.cy.psi.service;

import com.cy.psi.entity.SysMenu;

import java.util.List;

/**
 * @Author Twx
 * @Date 2021/7/12 21:57
 * @Description 菜单业务层
 * @Since version-1.0
 */
public interface SysMenuService {
    int deleteByPrimaryKey(String menuId);

    int insert(SysMenu record);

    int insertSelective(SysMenu record);

    SysMenu selectByPrimaryKey(String menuId);

    int updateByPrimaryKeySelective(SysMenu record);

    int updateByPrimaryKey(SysMenu record);

    List<SysMenu> selectAllMenu();
}
