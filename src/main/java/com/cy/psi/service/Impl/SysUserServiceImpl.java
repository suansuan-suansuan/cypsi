package com.cy.psi.service.Impl;

import com.cy.psi.dao.SysUserDao;
import com.cy.psi.entity.SysUser;
import com.cy.psi.service.SysUserService;
import com.cy.psi.vo.SysUserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Author Twx
 * @Date 2021/7/12 8:16
 * @Description 用户业务实现层
 * @Since version-1.0
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserDao sysUserDao;

    @Override
    public int deleteByPrimaryKey(String uId) {
        return sysUserDao.deleteByPrimaryKey(uId);
    }

    @Override
    public int insert(SysUser record) {
        return sysUserDao.insert(record);
    }

    @Override
    public int insertSelective(SysUser record) {
        return sysUserDao.insertSelective(record);
    }

    @Override
    public SysUser selectByPrimaryKey(String uId) {
        return sysUserDao.selectByPrimaryKey(uId);
    }

    @Override
    public int updateByPrimaryKeySelective(SysUser record) {
        return sysUserDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysUser record) {
        return sysUserDao.updateByPrimaryKey(record);
    }

    @Override
    public List<SysUserVo> findAllUser() {
        return sysUserDao.findAllUser();
    }


}
