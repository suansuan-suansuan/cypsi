package com.cy.psi.controller;

import com.cy.psi.entity.CypsiPuorder;
import com.cy.psi.entity.Goods;
import com.cy.psi.service.GoodsService;
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
@CrossOrigin
@RequestMapping("test")
public class GoodsController {

    @Resource
    private GoodsService goodsService;

    @GetMapping("/GoselectAll")
    public PageInfo<Goods> poses(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize) {
        PageHelper.startPage(currentPage,pagesize);
        List<Goods> entityPage=goodsService.GoselectAll();
        PageInfo<Goods> BookVoPageInfo=new PageInfo<>(entityPage);
        return  BookVoPageInfo;
    }

}
