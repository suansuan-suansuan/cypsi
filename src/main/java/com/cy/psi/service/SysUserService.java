package com.cy.psi.service;

import com.cy.psi.entity.SysMenu;
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
    /**
     * 通过id查询用户
     * @param uid
     * @return
     */
    SysUser queryById(String uid);

    /**
     * 查询userid通过username
     * @param username
     * @return
     */
    String queryUserIdByUserName(String username);

    SysUser selectUserByName(String username);

    List<SysUser> findhaveapproved();
    List<SysMenu> usermenu(String userId);

    List<SysUser> selectAll();
}
