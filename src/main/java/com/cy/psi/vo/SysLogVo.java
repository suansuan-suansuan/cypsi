package com.cy.psi.vo;

import com.cy.psi.entity.SysUser;
import lombok.Data;

import java.sql.Timestamp;

/**
 * @Author Twx
 * @Date 2021/7/10 23:54
 * @Description 系统日志封装返回类
 * @Since version-1.0
 */
@Data
public class SysLogVo {
    /**
     * 日志ID
     * */
    private String logId;
    /**
     * 创建时间
     * */
    private Timestamp createTime;
    /**
     * 用户
     * */
    private SysUser user;
    /**
     * 操作
     * */
    private String operation;
    /**
     * ip地址
     * */
    private String ipaddress;
    /**
     * 变更信息
     * */
    private String changeInfo;
    /**
     * 操作结果
     * */
    private String operationResult;
}
