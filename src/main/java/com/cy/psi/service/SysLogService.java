package com.cy.psi.service;

import com.cy.psi.entity.Log;
import com.cy.psi.vo.SysLogVo;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @Author Twx
 * @Date 2021/7/11 0:05
 * @Description 系统日志业务层
 * @Since version-1.0
 */
public interface SysLogService {

    int addSysLog(Log log);

    PageInfo<SysLogVo> findAllLog(int page, int size);

}
