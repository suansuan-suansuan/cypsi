package com.cy.psi.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * sys_user
 * @author 
 */
@Data
public class SysUser implements Serializable {
    /**
     * 用户id
     */
    private String uId;

    /**
     * 用户编码
     */
    private String uCode;

    /**
     * 用户名称
     */
    private String uName;

    /**
     * 用户密码
     */
    private String uPass;

    /**
     * 所属部门
     */
    private String uDept;

    /**
     * 是否禁用
     */
    private Integer isdisabled;

    private static final long serialVersionUID = 1L;
}