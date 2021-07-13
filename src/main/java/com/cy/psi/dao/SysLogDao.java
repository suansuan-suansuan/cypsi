package com.cy.psi.dao;

import com.cy.psi.entity.Log;
import com.cy.psi.vo.SysLogVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author Twx
 * @Date 2021/7/10 23:35
 * @Description 系统日志数据访问层
 * @Since version-1.0
 */
@Repository
@Mapper
public interface SysLogDao {

    int addSysLog(Log log);

    List<SysLogVo> findAllLog();
}
