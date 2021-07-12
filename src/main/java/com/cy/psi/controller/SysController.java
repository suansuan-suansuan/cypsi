package com.cy.psi.controller;
import com.cy.psi.anno.SysLog;
import com.cy.psi.entity.BaseDept;
import com.cy.psi.service.BaseDeptService;
import com.cy.psi.service.SysUserAllService;
import com.cy.psi.utils.IdWorker;
import com.cy.psi.vo.AjaxResponse;
import com.cy.psi.vo.SysUserReqVo;
import org.aspectj.weaver.loadtime.Aj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

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
    private IdWorker idWorker;

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
     * 添加所有用户
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

}
