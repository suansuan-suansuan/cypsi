package com.cy.psi.vo;

import com.cy.psi.entity.BaseDept;
import lombok.Data;

import java.util.List;

@Data
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
