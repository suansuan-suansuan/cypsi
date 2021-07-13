package com.cy.psi.service.Impl;

import com.cy.psi.dao.SysRoleDao;
import com.cy.psi.entity.SysRole;
import com.cy.psi.service.SysRoleService;
import com.cy.psi.vo.RoleMenuVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Twx
 * @Date 2021/7/12 20:53
 * @Description 用户角色业务实现层
 * @Since version-1.0
 */
@Service
public class SysRoleServiceImpl implements SysRoleService {
    @Autowired
    private SysRoleDao sysRoleDao;

    /**
     * @Author Twx
     * @Date 2021/7/12 21:28
     * @Description 根据ID删除角色
     * @Param [roleId]
     * @Return int
     * @Since version-1.0
     */
    @Override
    public int deleteByPrimaryKey(String roleId) {
        return sysRoleDao.deleteByPrimaryKey(roleId);
    }

    /**
     * @Author Twx
     * @Date 2021/7/12 21:26
     * @Description 添加角色
     * @Param [record]
     * @Return int
     * @Since version-1.0
     */
    @Override
    public int insert(SysRole record) {
        return sysRoleDao.insert(record);
    }

    /**
     * @Author Twx
     * @Date 2021/7/12 21:26
     * @Description 添加角色
     * @Param [record]
     * @Return int
     * @Since version-1.0
     */
    @Override
    public int insertSelective(SysRole record) {
        return sysRoleDao.insertSelective(record);
    }

    /**
     * @Author Twx
     * @Date 2021/7/12 21:28
     * @Description 根据ID查询角色
     * @Param [roleId]
     * @Return com.cy.psi.entity.SysRole
     * @Since version-1.0
     */
    @Override
    public SysRole selectByPrimaryKey(String roleId) {
        return sysRoleDao.selectByPrimaryKey(roleId);
    }

    /**
     * @Author Twx
     * @Date 2021/7/12 21:27
     * @Description 根据ID条件修改角色
     * @Param [record]
     * @Return int
     * @Since version-1.0
     */
    @Override
    public int updateByPrimaryKeySelective(SysRole record) {
        return sysRoleDao.updateByPrimaryKeySelective(record);
    }

    /**
     * @Author Twx
     * @Date 2021/7/12 21:27
     * @Description 根据ID修改角色
     * @Param [record]
     * @Return int
     * @Since version-1.0
     */
    @Override
    public int updateByPrimaryKey(SysRole record) {
        return sysRoleDao.updateByPrimaryKey(record);
    }

    /**
     * @Author Twx
     * @Date 2021/7/12 20:54
     * @Description 查询所有角色
     * @Param []
     * @Return java.util.List<com.cy.psi.entity.SysRole>
     * @Since version-1.0
     */
    @Override
    public List<SysRole> selectAllRole() {
        return sysRoleDao.selectAllRole();
    }

    /**
     * @Author Twx
     * @Date 2021/7/13 8:22
     * @Description 根据角色ID查询角色和菜单
     * @Param [roleId]
     * @Return java.util.List<com.cy.psi.vo.RoleMenuVo>
     * @Since version-1.0
     */
    @Override
    public RoleMenuVo selectRoleMenuByRoleId(String roleId) {
        return sysRoleDao.selectRoleMenuByRoleId(roleId);
    }


    @Override
    public String queryRoleNameByroleId(String roleId) {
        return sysRoleDao.queryRoleNameByroleId(roleId);
    }
}
