package com.cy.psi.entity;

import java.io.Serializable;

import com.cy.psi.vo.SysUserReqVo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * sys_approved
 * @author 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SysApproved{
    /**
     * 用户id
     */
    private String uId;

    /**
     * 审核用户id
     */
    private String approvedUId;

    /**
     * 审核用户名称
     */
    private String approvedUName;



    private static final long serialVersionUID = 1L;
}