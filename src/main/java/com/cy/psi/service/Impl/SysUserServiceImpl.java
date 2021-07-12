package com.cy.psi.service.Impl;

import com.cy.psi.dao.SysUserDao;
import com.cy.psi.entity.SysUser;
import com.cy.psi.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 酸酸
 */
@Service("SysUserService")
public class SysUserServiceImpl implements SysUserService {
    @Resource
    private SysUserDao sysUserDao;
    @Override
    public SysUser queryById(String uid) {
        return this.sysUserDao.selectByPrimaryKey(uid);
    }

    @Override
    public String queryUserIdByUserName(String username) {
        return this.sysUserDao.queryUserIdByUserName(username);
    }
}
