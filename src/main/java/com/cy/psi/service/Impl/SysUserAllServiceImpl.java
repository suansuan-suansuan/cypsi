package com.cy.psi.service.Impl;

import com.cy.psi.entity.*;
import com.cy.psi.service.*;
import com.cy.psi.utils.IdWorker;
import com.cy.psi.vo.RoleMenuVo;
import com.cy.psi.vo.SysUserReqVo;
import com.cy.psi.vo.SysUserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.awt.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author Twx
 * @Date 2021/7/12 8:40
 * @Description 用户所有操作业务实现层
 * @Since version-1.0
 */
@Service
public class SysUserAllServiceImpl implements SysUserAllService {
    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private SysApprovedService sysApprovedService;

    @Autowired
    private SysRoleService sysRoleService;

    @Autowired
    private SysRoleMenuService sysRoleMenuService;

    @Autowired
    private SysUserRoleService sysUserRoleService;

    @Autowired
    private IdWorker idWorker;



    /**
     * @Author Twx
     * @Date 2021/7/12 14:44
     * @Description 添加所有用户
     * @Param [sysUserReqVo]
     * @Return int
     * @Since version-1.0
     */
    @Transactional
    @Override
    public int addUser(SysUserReqVo sysUserReqVo) {
        //根据返回信息创建用户对象
        SysUser user=new SysUser(sysUserReqVo);
        //保存用户对象
        sysUserService.insert(user);

        //保存用户角色
        SysUserRole sysUserRole=new SysUserRole();
        sysUserRole.setUId(user.getUId());
        sysUserRole.setRoleId(sysUserReqVo.getRole().getRoleId());
        sysUserRoleService.insert(sysUserRole);

        //批量保存用户审批对象
        for (String approvedId : sysUserReqVo.getApprovedIds()) {
            SysUser sysUser = sysUserService.selectByPrimaryKey(approvedId);
            System.out.println("-======="+sysUser);
            SysApproved sysApproved = new SysApproved();

            sysApproved.setUId(sysUserReqVo.getUId());
            sysApproved.setApprovedUId(approvedId);
            sysApproved.setApprovedUName(sysUser.getUName());

            sysApprovedService.insert(sysApproved);
        }
        return 1;
    }

    /**
     * 修改用户
     * */
    @Override
    @Transactional
    public void updateUser(SysUserReqVo sysUserReqVo) {
        SysUser sysUser = new SysUser(sysUserReqVo);
        //修改用户信息
        sysUserService.updateByPrimaryKeySelective(sysUser);

        //查询出该用户的角色
        List<SysUserRole> sysUserRoles = sysUserRoleService.selectUserAllRole(sysUser.getUId());

        for (SysUserRole sysUserRole : sysUserRoles) {
            //删除该用户的角色
            sysUserRoleService.delUserRole(sysUserRole);
        }

        List<SysApproved> sysApproveds = sysApprovedService.selectApproByUid(sysUser.getUId());
        //删除当前用户所有的可审批的人
        for (SysApproved sysApproved : sysApproveds) {
            sysApprovedService.deleteByUidAndAppro(sysApproved);
        }

        for (String approvedId : sysUserReqVo.getApprovedIds()) {
            SysUser sysUser2 = sysUserService.selectByPrimaryKey(approvedId);
            //重新插入当前用户所有的可审批的人
            SysApproved sysApproved = new SysApproved();
            sysApproved.setUId(sysUserReqVo.getUId());
            sysApproved.setApprovedUId(approvedId);
            sysApproved.setApprovedUName(sysUser2.getUName());
            sysApprovedService.insert(sysApproved);
        }


    }

    /**
     * 查询所有用户的所有信息
     * */
    @Override
    public List<SysUserVo> findAllUser() {
        return sysUserService.findAllUser();
    }

    /**
     * 删除用户
     * */
    @Transactional
    @Override
    public void delUser(String uId) {

        //查询出该用户的角色
        List<SysUserRole> sysUserRoles = sysUserRoleService.selectUserAllRole(uId);

        for (SysUserRole sysUserRole : sysUserRoles) {
            //删除该用户的角色
            sysUserRoleService.delUserRole(sysUserRole);
        }

        List<SysApproved> sysApproveds = sysApprovedService.selectApproByUid(uId);
        //删除当前用户所有的可审批的人
        for (SysApproved sysApproved : sysApproveds) {
            sysApprovedService.deleteByUidAndAppro(sysApproved);
        }

        sysUserService.deleteByPrimaryKey(uId);
    }

    @Override
    public String queryUserIdByUserName(String username) {
        return sysUserService.queryUserIdByUserName(username);
    }

    /**
     * 用户登录
     * */
    @Override
    public SysUser login(String username) {
        return sysUserService.selectUserByName(username);
    }


    /**
     * 插入角色与菜单
     * */
    @Transactional
    @Override
    public void addRoleAndMenu(RoleMenuVo roleMenuVo) {
        SysRole sysRole=new SysRole();
        sysRole.setRoleName(roleMenuVo.getRoleName());
        sysRole.setFounder(roleMenuVo.getFounder());
        sysRole.setFoundTime(new Date());
        sysRole.setRoleId(idWorker.nextId()+"");
        sysRoleService.insert(sysRole);


        List<SysMenu> menus =roleMenuVo.getMenus();
        //循环添加角色与菜单的依赖
        for (SysMenu menu : menus) {
            SysRoleMenu sysRoleMenu=new SysRoleMenu();
            sysRoleMenu.setRoleId(sysRole.getRoleId());
            sysRoleMenu.setMenuId(menu.getMenuId());
            sysRoleMenuService.insert(sysRoleMenu);
        }



    }

    /**
     * 插入角色与菜单
     * */
    @Transactional
    @Override
    public void updateRoleAndMenu(RoleMenuVo roleMenuVo) {
        SysRole sysRole = sysRoleService.selectByPrimaryKey(roleMenuVo.getRoleId());
        sysRole.setRoleName(roleMenuVo.getRoleName());
        sysRole.setUpdateBy(roleMenuVo.getUpdateBy());
        sysRole.setUpdateTime(new Timestamp(System.currentTimeMillis()));
        sysRoleService.updateByPrimaryKey(sysRole);

        //找到之前角色与菜单的关联，删除
        RoleMenuVo roleMenuVo1 = sysRoleService.selectRoleMenuByRoleId(sysRole.getRoleId());
        if(roleMenuVo1!=null){
            List<SysMenu> menus1=roleMenuVo1.getMenus();
            for (SysMenu sysMenu : menus1) {
                SysRoleMenu sysRoleMenu = new SysRoleMenu();
                sysRoleMenu.setRoleId(sysRole.getRoleId());
                sysRoleMenu.setMenuId(sysMenu.getMenuId());
                sysRoleMenuService.delRoleMenu(sysRoleMenu);
            }
        }

        List<SysMenu> menus2 =roleMenuVo.getMenus();
        //循环添加角色与菜单的依赖
        for (SysMenu menu : menus2) {
            SysRoleMenu sysRoleMenu=new SysRoleMenu();
            sysRoleMenu.setRoleId(sysRole.getRoleId());
            sysRoleMenu.setMenuId(menu.getMenuId());
            sysRoleMenuService.insert(sysRoleMenu);
        }

    }

    @Override
    public List<SysMenu> usermenu(String userId) {
        return sysUserService.usermenu(userId);
    }

    @Override
    public void delRoleAndMenu(String roleId) {
        //找到之前角色与菜单的关联，删除
        RoleMenuVo roleMenuVo1 = sysRoleService.selectRoleMenuByRoleId(roleId);
        if(roleMenuVo1!=null){
            List<SysMenu> menus1=roleMenuVo1.getMenus();
            for (SysMenu sysMenu : menus1) {
                SysRoleMenu sysRoleMenu = new SysRoleMenu();
                sysRoleMenu.setRoleId(roleId);
                sysRoleMenu.setMenuId(sysMenu.getMenuId());
                sysRoleMenuService.delRoleMenu(sysRoleMenu);
            }
        }
        sysRoleService.deleteByPrimaryKey(roleId);
    }
}
