package com.cy.psi.service.Impl;

import com.cy.psi.dao.SysLogDao;
import com.cy.psi.entity.Log;
import com.cy.psi.service.SysLogService;
import com.cy.psi.vo.SysLogVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Twx
 * @Date 2021/7/11 0:06
 * @Description 系统日志业务层
 * @Since version-1.0
 */
@Service
public class SysLogServiceImpl implements SysLogService {
    @Autowired
    private SysLogDao sysLogDao;

    /**
     * @Author Twx
     * @Date 2021/7/11 0:07
     * @Description 添加系统日志
     * @Param [sysLog]
     * @Return int
     * @Since version-1.0
     */
    @Override
    public int addSysLog(Log log) {
        return sysLogDao.addSysLog(log);
    }

    /**
     * @Author Twx
     * @Date 2021/7/11 0:07
     * @Description 分页查询所有系统日志
     * @Param [sysLog]
     * @Return int
     * @Since version-1.0
     */
    @Override
    public PageInfo<SysLogVo>findAllLog(int page,int size){
        PageHelper.startPage(page, size);
        List<SysLogVo> logList = sysLogDao.findAllLog();
        PageInfo<SysLogVo> pageInfo =new PageInfo<>(logList);
        return pageInfo;
    }


}
