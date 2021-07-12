package com.cy.psi.controller;

import com.cy.psi.entity.Allotwarehouse;
import com.cy.psi.service.AllotwarehouseService;
import com.cy.psi.vo.AllotwarehouseVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Allotwarehouse)表控制层
 *
 * @author makejava
 * @since 2021-07-11 11:19:17
 */
@Slf4j
//跨域注释
@CrossOrigin
@RestController
public class AllotwarehouseController {
    /**
     * 服务对象
     */
    @Resource
    private AllotwarehouseService allotwarehouseService;

    //分页查询调拨单
    @GetMapping("/selectAllotwarehouse")
    public PageInfo<Allotwarehouse>selectAllotwarehouse (@RequestParam("currentPage") Integer currentPage, @RequestParam("pagesize") Integer pagesize){
        log.debug("分页查询信息");
        PageHelper.startPage(currentPage,pagesize);
        log.debug("---------------------------------------------------");
        List<Allotwarehouse> entityPage =allotwarehouseService.selectAllotwarehouse();
        PageInfo<Allotwarehouse> classtypeVoPageInfo = new  PageInfo<>(entityPage);
        return classtypeVoPageInfo;
    }

    //     高级分页查询调拨单
    @GetMapping("/selectBylikeAllotwarehouse")
    public PageInfo<Allotwarehouse> selectBylikeAllotwarehouse(@RequestParam("currentPage") int currentPage,
                                             @RequestParam("pagesize") int pagesize,
                                             @RequestParam(value ="serialNumber",required = false) String serialNumber,
                                             @RequestParam(value ="documentmaker",required = false) String documentmaker,
                                             @RequestParam(value ="depotName",required = false) String depotName){
        List<Allotwarehouse> entityPage =allotwarehouseService.selectBylikeAllotwarehouse(serialNumber,documentmaker,depotName);
        PageHelper.startPage(currentPage,pagesize);
        PageInfo<Allotwarehouse> classtypeVoPageInfo = new  PageInfo<>(entityPage);
        return classtypeVoPageInfo;
    }

    //    逻辑删除
    @PutMapping("/DelAllotwarehouse")
    public Integer DelAllotwarehouse(@RequestBody AllotwarehouseVo vo){
        log.info("channelid:"+vo.getChannelid());
        log.info("timeLiness:"+vo.getTimeLiness());
        log.debug("修改想去");
        return allotwarehouseService.DelAllotwarehouse(vo.getTimeLiness(),vo.getChannelid());
    }

}
