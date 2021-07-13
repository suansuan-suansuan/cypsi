package com.cy.psi.entity;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * sys_menu
 * @author 
 */
@Data
public class SysMenu implements Serializable {
    /**
     * 菜单id
     */
    private String menuId;

    /**
     * 菜单名称
     */
    private String menuName;

    /**
     * 父菜单id
     */
    private String parentId;

    /**
     * 组件排序
     */
    private Integer orderNum;

    /**
     * 菜单类型
     */
    private String menuType;

    /**
     * 路由地址
     */
    private String path;

    /**
     * 路由名称
     */
    private String name;

    /**
     * 菜单图标
     */
    private String icon;

    /**
     * 权限标识
     */
    private String perms;

    /**
     * 菜单状态（0显示 1隐藏）
     */
    private Integer visible;

    /**
     * 组件路径
     */
    private String component;

    /**
     * 子组件
     */
    private List<SysMenu> childMenu;

    private static final long serialVersionUID = 1L;
}