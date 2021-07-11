package com.cy.psi.controller;

import com.cy.psi.entity.CypsiPuorder;
import com.cy.psi.service.PuorderSerice;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 皮皮虾
 */
@RestController
@Slf4j
@RequestMapping("test")
public class PuorderController {

    @Resource
    private PuorderSerice puorderSerice;

    @GetMapping("/PuoselectAll")
    public PageInfo<CypsiPuorder> poses(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize) {
        PageHelper.startPage(currentPage,pagesize);
        List<CypsiPuorder> entityPage=puorderSerice.selectAll();
        PageInfo<CypsiPuorder> BookVoPageInfo=new PageInfo<>(entityPage);
        return  BookVoPageInfo;
    }


    @GetMapping("selectAllSJ")
    public PageInfo<CypsiPuorder> selectAllSJ(@RequestParam("currentPage") int currentPage,
                                              @RequestParam("pagesize") int pagesize,
                                              @RequestParam(value ="Starttime",required = false) String Starttime,
                                              @RequestParam(value ="Endtime",required = false) String Endtime){
        List<CypsiPuorder> entityPage =puorderSerice.selectAllSJ(Starttime,Endtime);
        PageHelper.startPage(currentPage,pagesize);
        PageInfo<CypsiPuorder> classtypeVoPageInfo = new  PageInfo<>(entityPage);
        return classtypeVoPageInfo;
    }

    @PostMapping("/insertPu")
    public CypsiPuorder insertBack(@RequestBody CypsiPuorder cypsiPuorder){
        puorderSerice.insertPu(cypsiPuorder);
        return cypsiPuorder;
    }
}
