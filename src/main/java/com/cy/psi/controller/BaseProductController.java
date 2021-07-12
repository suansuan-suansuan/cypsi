package com.cy.psi.controller;

import com.cy.psi.entity.BaseProduct;
import com.cy.psi.entity.BaseVendor;
import com.cy.psi.service.BaseProductService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
@CrossOrigin
@RequestMapping("baseProduct")
public class BaseProductController {
    @Resource
    private BaseProductService baseProductService;

    /**
     * 分页查询产品数据
     * @param pageNum
     * @param pageSize
     * @return
     */
    @GetMapping("/SelectAll")
    public PageInfo<BaseProduct> baseProductPageInfo(@RequestParam("pageNum") int pageNum,@RequestParam("pageSize") int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<BaseProduct> page=baseProductService.SelectAll();
        PageInfo<BaseProduct> pageInfo=new PageInfo<>();
        return pageInfo;
    }

    @GetMapping("/GenJuselectAll")
    public List<BaseProduct> GenJuselectAll(){
        List<BaseProduct> Bacv =baseProductService.GenJuselectAll();
        return Bacv;
    }
}
