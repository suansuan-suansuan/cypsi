package com.cy.psi.controller;

import com.cy.psi.entity.Checkwarehouse;
import com.cy.psi.service.CheckwarehouseService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Checkwarehouse)表控制层
 *
 * @author makejava
 * @since 2021-07-11 10:12:25
 */
@RestController
//跨域注释
@CrossOrigin
@Slf4j
public class CheckwarehouseController {
    /**
     * 服务对象
     */
    @Resource
    private CheckwarehouseService checkwarehouseService;

    //分页查询盘点单
    @GetMapping("/selectCheckwarehouse")
    public PageInfo<Checkwarehouse> selectfinds(@RequestParam("currentPage") Integer currentPage, @RequestParam("pagesize") Integer pagesize){
        PageHelper.startPage(currentPage,pagesize);
        List<Checkwarehouse> entityPage =checkwarehouseService.selectCheckwarehouse();
        PageInfo<Checkwarehouse> classtypeVoPageInfo = new  PageInfo<>(entityPage);
        return classtypeVoPageInfo;
    }


}
