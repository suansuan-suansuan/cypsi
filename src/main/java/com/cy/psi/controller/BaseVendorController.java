package com.cy.psi.controller;

import com.cy.psi.entity.BaseVendor;
import com.cy.psi.service.BaseVendorService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("BaseVendor")
public class BaseVendorController {
    @Resource
    private BaseVendorService baseVendorService;
    /**
     * 分页查询供应商数据
     * @return
     */
    @GetMapping("/selectAll")
    public PageInfo<BaseVendor> baseVendorPageInfo (@RequestParam("pageNum") int pageNum,@RequestParam("pageSize") int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<BaseVendor> page=baseVendorService.selectAll();
        PageInfo<BaseVendor> pageInfo=new PageInfo<>();
        return pageInfo;
    }
}
