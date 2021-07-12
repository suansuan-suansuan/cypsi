package com.cy.psi.controller;

import com.cy.psi.entity.BaseVendor;
import com.cy.psi.service.BaseVendorService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
@CrossOrigin
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

    @GetMapping("/selectAll88")
    public List<BaseVendor> selectAll88(){
        List<BaseVendor> Bacv =baseVendorService.selectAll88();
        return Bacv;
    }
}
