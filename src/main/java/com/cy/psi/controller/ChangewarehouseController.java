package com.cy.psi.controller;

import com.cy.psi.entity.Allotwarehouse;
import com.cy.psi.entity.Inventory;
import com.cy.psi.service.ChangewarehouseService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Inventory)表控制层
 *
 * @author makejava
 * @since 2021-07-11 15:23:37
 */
@RestController
@Slf4j
//跨域注释
@CrossOrigin
public class ChangewarehouseController {
    /**
     * 服务对象
     */
    @Resource
    private ChangewarehouseService inventoryService;
    //分页查询库存
    @GetMapping("/selectChangewarehouse")
    public PageInfo<Inventory> selectChangewarehouse (@RequestParam("currentPage") Integer currentPage, @RequestParam("pagesize") Integer pagesize){
        log.debug("分页查询信息");
        PageHelper.startPage(currentPage,pagesize);
        log.debug("---------------------------------------------------");
        List<Inventory> entityPage =inventoryService.selectChangewarehouse();
        PageInfo<Inventory> classtypeVoPageInfo = new  PageInfo<>(entityPage);
        return classtypeVoPageInfo;
    }

    //     高级分页查询库存
    @GetMapping("/selectBylikeChangewarehouse")
    public PageInfo<Inventory> selectBylikeChangewarehouse(@RequestParam("currentPage") int currentPage,
                                                           @RequestParam("pagesize") int pagesize,
                                                           @RequestParam(value ="depotName",required = false) String depotName,
                                                           @RequestParam(value ="productName",required = false) String productName
    ){
        List<Inventory> entityPage =inventoryService.selectBylikeChangewarehouse(depotName,productName);
        PageHelper.startPage(currentPage,pagesize);
        PageInfo<Inventory> classtypeVoPageInfo = new  PageInfo<>(entityPage);
        return classtypeVoPageInfo;
    }


}
