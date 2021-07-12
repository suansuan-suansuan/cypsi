package com.cy.psi.controller;

import com.cy.psi.entity.BaseDepot;
import com.cy.psi.entity.BaseVendor;
import com.cy.psi.service.BaseDepotService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
@RestController
@Slf4j
@CrossOrigin
@RequestMapping("baseDepot")
public class BaseDepotController {

    @Resource
    private BaseDepotService baseDepotService;

    /**
     * 分页查询仓库数据
     * @param pageNum
     * @param pageSize
     * @return
     */
    @GetMapping("/SelectAll")
    public PageInfo<BaseDepot> baseDepotPageInfo(@RequestParam("pageNum") int pageNum, @RequestParam("pageSize") int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        List<BaseDepot> page=baseDepotService.SelectAll();
        PageInfo<BaseDepot> PageInfo=new PageInfo<>(page);
        return PageInfo;
    }

    @GetMapping("/selectAll100")
    public List<BaseDepot> selectAll100(){
        List<BaseDepot> Bacv =baseDepotService.selectAll100();
        return Bacv;
    }
}
