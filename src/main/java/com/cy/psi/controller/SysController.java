package com.cy.psi.controller;
import com.cy.psi.anno.SysLog;
import com.cy.psi.entity.BaseDept;
import com.cy.psi.entity.SysMenu;
import com.cy.psi.entity.SysRole;
import com.cy.psi.entity.SysUser;
import com.cy.psi.service.*;
import com.cy.psi.utils.IdWorker;
import com.cy.psi.vo.AjaxResponse;
import com.cy.psi.vo.RoleMenuVo;
import com.cy.psi.vo.SysUserReqVo;
import com.cy.psi.vo.UserVo;
import org.aspectj.weaver.loadtime.Aj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @Author Twx
 * @Date 2021/7/11 0:50
 * @Description 系统操作控制层
 * @Since version-1.0
 */
@RestController
@CrossOrigin
@RequestMapping("/sys")
public class SysController {

    @Autowired
    private BaseDeptService baseDeptService;

    @Autowired
    private SysUserAllService sysUserAllService;

    @Autowired
    private SysRoleService sysRoleService;

    @Autowired
    private SysMenuService sysMenuService;

    @Autowired
    private SysLogService sysLogService;

    @Autowired
    private IdWorker idWorker;

    @Autowired
    private SysUserRoleService sysUserRoleService;

    @SysLog("测试")
    @PostMapping("/test")
    public AjaxResponse test(){
        return AjaxResponse.success();
    }


    /**
     * @Author Twx
     * @Date 2021/7/11 16:16
     * @Description 返回所有部门
     * @Param []
     * @Return com.cy.psi.vo.AjaxResponse
     * @Since version-1.0
     */
    @GetMapping("/getAllDept")
    public AjaxResponse getAllDept(){
        return AjaxResponse.success(baseDeptService.findAllDept());
    }


    /**
     * 添加部门
     * */
    @GetMapping("/addDept/{parent}")
    public AjaxResponse addDept(@PathVariable int parent){
        BaseDept baseDept =new BaseDept();
        baseDept.setParentId(parent);
        Object max =  baseDeptService.findMaxId(parent);
        if(max==null){
            max=parent*10;
        }
        baseDept.setDeptId((int)max+1);
        baseDept.setDname("新部门");
        baseDeptService.insertSelective(baseDept);
        return AjaxResponse.success(baseDept);
    }


    /**
     * 编辑部门
     * */
    @PutMapping("/updateDept")
    public AjaxResponse updateDept(@RequestBody BaseDept baseDept){
        baseDeptService.updateByPrimaryKey(baseDept);
        return AjaxResponse.success();
    }

    /**
     * 删除部门
     * */
    @DeleteMapping("/delDept/{id}")
    public AjaxResponse delDept(@PathVariable int id){
        baseDeptService.deleteByPrimaryKey(id);
        return AjaxResponse.success();
    }

    /**
     * 查询所有用户的所有信息
     * */
    @GetMapping("/getAllUser")
    public AjaxResponse getAllUser(){
        return AjaxResponse.success(sysUserAllService.findAllUser());
    }


    /**
     * 添加用户
     * */
    @PostMapping("/addUserInfo")
    public AjaxResponse addUserInfo(@RequestBody SysUserReqVo sysUserReqVo){
        sysUserReqVo.setUId(idWorker.nextId()+"");
        System.out.println(sysUserReqVo.toString());
        sysUserAllService.addUser(sysUserReqVo);
        return AjaxResponse.success();
    }

    /**
     * 修改用户
     * */
    @PutMapping("/updateUser")
    public AjaxResponse updateUser(@RequestBody SysUserReqVo sysUserReqVo){
        System.out.println(sysUserReqVo.toString());
        sysUserAllService.updateUser(sysUserReqVo);
        return AjaxResponse.success();
    }


    /**
     * 删除用户
     * */
    @DeleteMapping("/delUser/{uId}")
    public AjaxResponse updateUser(@PathVariable String uId){
        sysUserAllService.delUser(uId);
        return AjaxResponse.success();
    }

    /**
     * 用户登录
     * */
    @SysLog("登录")
    @PostMapping("/login")
    public AjaxResponse login(@RequestBody Map map){
        SysUser sysUser =new SysUser();
        sysUser.setUName((String) map.get("uName"));
        sysUser.setUPass((String) map.get("uPass"));
        SysUser loginuser = sysUserAllService.login(sysUser.getUName());
        if (loginuser == null) {
            return AjaxResponse.success("账户不存在");
        } else {
            if (loginuser.getIsdisabled() != 0) {
                return AjaxResponse.success("账户已停用！请联系超级管理员！");
            } else if (!sysUser.getUPass().equals(loginuser.getUPass())) {
                return AjaxResponse.success("密码错误");
            } else {
                String userid = sysUserAllService.queryUserIdByUserName(loginuser.getUName());
                //通过用户id获取角色id
                List<String> roleId =  sysUserRoleService.queryRoleIdbyUserId(userid);
                //通过角色id获取角色名
                List<String> roleNames=new ArrayList<String>();
                for (int i=0;i<roleId.size();i++) {
                    String roleName= sysRoleService.queryRoleNameByroleId(roleId.get(i));
                    roleNames.add(roleName);
                }
                List<SysMenu> usermenu = sysUserAllService.usermenu(loginuser.getUId());
                //获取父菜单
                UserVo userVo = new UserVo();
                userVo.setUser(loginuser);
                userVo.setMenus(usermenu);
                userVo.setValidate(true);
                return AjaxResponse.success(userVo);
            }
        }

    }

    /**
     * 返回所有角色
     * */
    @GetMapping("/getAllRoles")
    public AjaxResponse getAllRoles(){
        return AjaxResponse.success(sysRoleService.selectAllRole());
    }


    /**
     * 查询所有菜单
     * */
    @GetMapping("/getAllMenu")
    public AjaxResponse getAllMenu (){
        return AjaxResponse.success(sysMenuService.selectAllMenu());
    }

    /**
     * 添加角色以及和菜单的联系
     * */
    @PostMapping("/addRoleAndMenu")
    public AjaxResponse addRoleAndMenu(@RequestBody RoleMenuVo roleMenuVo){
        System.out.println("roleMenuVo=>"+roleMenuVo.toString());
        sysUserAllService.addRoleAndMenu(roleMenuVo);
        return AjaxResponse.success();
    }

    /**
     * 根据角色id获取角色和菜单信息
     * */
    @GetMapping("/getRoleAndMenu/{roleId}")
    public AjaxResponse getRoleAndMenu(@PathVariable String roleId){
        return AjaxResponse.success(sysRoleService.selectRoleMenuByRoleId(roleId));
    }

    /**
     * 修改角色和菜单信息
     * */
    @PutMapping("/updateRoleAndMenu")
    public AjaxResponse updateRoleAndMenu(@RequestBody RoleMenuVo roleMenuVo){
        sysUserAllService.updateRoleAndMenu(roleMenuVo);
        return AjaxResponse.success();
    }

    /**
     * 递归查询子菜单
     * @param root 根菜单
     * @param all  所有菜单
     * @return 菜单信息
     */
    public List<SysMenu> getChildrens(SysMenu root, List<SysMenu> all) {
        List<SysMenu> children = all.stream().filter(m -> {
            return Objects.equals(m.getParentId(), root.getMenuId());
        }).map(
                (m) -> {
                    m.setChildMenu(getChildrens(m, all));
                    return m;
                }
        ).collect(Collectors.toList());
        return children;
    }

    /**
     * @Author Twx
     * @Date 2021/7/13 13:16
     * @Description 打印所有操作日志
     * @Param []
     * @Return com.cy.psi.vo.AjaxResponse
     * @Since version-1.0
     */
    @GetMapping("/getAllLog")
    public AjaxResponse getAllLog(){
        return AjaxResponse.success(sysLogService.findAllLog());
    }


    @DeleteMapping("/delRoleAndMenu/{roleId}")
    public AjaxResponse delRoleAndMenu(@PathVariable String roleId){
        System.out.println(roleId);
        sysUserAllService.delRoleAndMenu(roleId);
        return AjaxResponse.success();
    }

}
