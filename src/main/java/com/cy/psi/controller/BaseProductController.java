package com.cy.psi.controller;

import com.cy.psi.entity.BaseProduct;
import com.cy.psi.service.BaseProductService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("baseProduct")
@Slf4j
public class BaseProductController {
    @Resource
    private BaseProductService baseProductService;

    @GetMapping("/SelectAll")
    public PageInfo<BaseProduct> baseProductPageInfo(@RequestParam("pageNum") int pageNum,@RequestParam("pageSize") int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<BaseProduct> page=baseProductService.SelectAll();
        PageInfo<BaseProduct> pageInfo=new PageInfo<>();
        return pageInfo;
    }
}
