package com.cy.psi.service;

import com.cy.psi.entity.SysUser;
import com.cy.psi.vo.SysUserVo;

import java.util.List;

/**
 * @Author Twx
 * @Date 2021/7/12 8:15
 * @Description 用户业务访问层
 * @Since version-1.0
 */
public interface SysUserService {
    int deleteByPrimaryKey(String uId);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(String uId);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    List<SysUserVo> findAllUser();
}
