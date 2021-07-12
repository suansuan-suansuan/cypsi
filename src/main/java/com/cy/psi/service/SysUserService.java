package com.cy.psi.service;

import com.cy.psi.entity.SysUser;

import java.awt.print.PrinterJob;

/**
 * @author 酸酸
 */
public interface SysUserService {
    /**
     * 通过id查询用户
     * @param uid
     * @return
     */
    SysUser queryById(String uid);

    /**
     * 查询userid通过username
     * @param user
     * @return
     */
    String queryUserIdByUserName(String username);
}
