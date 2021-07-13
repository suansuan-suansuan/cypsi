package com.cy.psi.vo;

import com.cy.psi.entity.BaseDept;
import com.cy.psi.entity.SysRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SysUserReqVo {
    /**
     * 用户id
     */
    private String uId;

    /**
     * 用户编码
     */
    private String ucode;

    /**
     * 用户名称
     */
    private String uname;

    /**
     * 用户密码
     */
    private String upass;
    /**
     * 角色
     * */
    private SysRole role;

    /**
     * 所属部门
     */
    private Integer udept;

    /**
     * 是否禁用
     */
    private Integer isdisabled;
    /**
     * 用户所有可审批人id
     * */
    private List<String> approvedIds;
}
