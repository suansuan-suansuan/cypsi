package com.cy.psi.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * sys_role_menu
 * @author 
 */
@Data
public class SysRoleMenu implements Serializable {
    /**
     * 角色id
     */
    private String roleId;

    /**
     * 菜单id
     */
    private String menuId;

    private static final long serialVersionUID = 1L;
}