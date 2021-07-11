package com.cy.psi.entity;

import lombok.Data;

/**
 * @Author Twx
 * @Date 2021/7/10 23:46
 * @Description 系统用户类
 * @Since version-1.0
 */
@Data
public class SysUser {
    /**
     * 用户id
     * */
    private String uId;
    /**
     * 用户编号
     * */
    private String uCode;
    /**
     * 用户名称
     * */
    private String uName;
    /**
     * 用户密码
     * */
    private String uPass;
    /**
     * 用户部门ID
     * */
    private String uDept;
}
