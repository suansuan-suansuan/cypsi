package com.cy.psi.service;

import com.cy.psi.vo.SysUserReqVo;
import com.cy.psi.vo.SysUserVo;

import java.util.List;

/**
 * @Author Twx
 * @Date 2021/7/12 8:29
 * @Description 用户所有操作业务层
 * @Since version-1.0
 */
public interface SysUserAllService {
    int addUser(SysUserReqVo sysUserReqVo);

    void updateUser(SysUserReqVo sysUserReqVo);

    List<SysUserVo> findAllUser();

    void delUser(String uId);
}
