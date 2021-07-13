package com.cy.psi.vo;

import com.cy.psi.entity.BaseDept;
import com.cy.psi.entity.SysRole;
import lombok.Data;

import java.util.List;

/**
 * @Author Twx
 * @Date 2021/7/12 8:31
 * @Description 用户操作封装实体类
 * @Since version-1.0
 */
@Data
public class SysUserVo {
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
     * 用户职务
     * */
    private SysRole role;

    /**
     * 所属部门
     */
    private BaseDept udept;

    /**
     * 是否禁用
     */
    private Integer isdisabled;
    /**
     * 用户所有可审批人id
     * */
    private List<String> approvedIds;
}
