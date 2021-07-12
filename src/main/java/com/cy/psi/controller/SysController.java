package com.cy.psi.controller;
import com.cy.psi.anno.SysLog;
import com.cy.psi.entity.BaseDept;
import com.cy.psi.service.BaseDeptService;
import com.cy.psi.vo.AjaxResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

}
