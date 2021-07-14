package com.cy.psi.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.sql.Timestamp;

/**
 * @Author Twx
 * @Date 2021/7/10 23:28
 * @Description This is description of class
 * @Since version-1.0
 */
@Data
public class Log {
    /**
     * 日志ID
     * */
    private String logId;
    /**
     * 创建时间
     * */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp createTime;
    /**
     * 用户ID
     * */
    private String uId;
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
