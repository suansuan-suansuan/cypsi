package com.cy.psi.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * sys_user_role
 * @author 
 */
@Data
public class SysUserRole implements Serializable {
    /**
     * 用户id
     */
    private String uId;

    /**
     * 角色id
     */
    private String roleId;

    private static final long serialVersionUID = 1L;
}