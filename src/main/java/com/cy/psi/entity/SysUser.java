package com.cy.psi.entity;

import java.io.Serializable;

import com.cy.psi.vo.SysUserReqVo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * sys_user
 * @author 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
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
    private Integer uDept;

    /**
     * 是否禁用
     */
    private Integer isdisabled;

    private static final long serialVersionUID = 1L;

    public SysUser(SysUserReqVo sysUserReqVo){
        this.uId=sysUserReqVo.getUId();
        this.uCode=sysUserReqVo.getUcode();
        this.uName=sysUserReqVo.getUname();
        this.uPass=sysUserReqVo.getUpass();
        this.uDept =sysUserReqVo.getUdept();
        this.isdisabled=sysUserReqVo.getIsdisabled();
    }

    
}