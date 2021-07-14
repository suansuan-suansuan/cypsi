package com.cy.psi.controller;

import com.cy.psi.entity.Goods;
import com.cy.psi.service.GoodsService;
import com.cy.psi.vo.GoodsRukuVo;
import com.cy.psi.vo.GoodsVo;
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
//跨域注释
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


//    ==========================================我唐某的地盘=============================================================

    @GetMapping("/GoselectAll2")
public PageInfo<Goods> GoselectAll2(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize) {
    PageHelper.startPage(currentPage,pagesize);
    List<Goods> entityPage=goodsService.GoselectAll2();
    PageInfo<Goods> BookVoPageInfo=new PageInfo<>(entityPage);
    return  BookVoPageInfo;
}

//     高级分页查询入库单
@GetMapping("/selectBylikeGoods")
public PageInfo<Goods> selectBylikeGoods(@RequestParam("currentPage") int currentPage,
                                                       @RequestParam("pagesize") int pagesize,
                                                       @RequestParam(value ="Starttime",required = false) String Starttime,
                                                       @RequestParam(value ="Endtime",required = false) String Endtime,
                                                       @RequestParam(value ="goodsZt",required = false) String goodsZt,
                                                       @RequestParam(value ="goodsState",required = false) Integer goodsState){
    List<Goods> entityPage =goodsService.selectBylikeGoods(Starttime,Endtime,goodsZt,goodsState);
    PageHelper.startPage(currentPage,pagesize);
    PageInfo<Goods> classtypeVoPageInfo = new  PageInfo<>(entityPage);
    return classtypeVoPageInfo;
}

    //    审核    入库单
    @PutMapping("/GoodsAudit")
    public Integer GoodsAudit(@RequestBody GoodsRukuVo vo){
        log.info("goodsZt:"+vo.getGoodsZt());
        log.info("goodsId:"+vo.getGoodsId());
        log.debug("修改想去");
        return goodsService.GoodsAudit(vo.getGoodsZt(),vo.getGoodsId());
    }


    //    逻辑删除
    @PutMapping("/DelGoods")
    public Integer DelGoods(@RequestBody GoodsVo vo){
        log.info("goodsId:"+vo.getGoodsId());
        log.info("timeLiness:"+vo.getTimeLiness());
        log.debug("修改想去");
        return goodsService.DelGoods(vo.getTimeLiness(),vo.getGoodsId());
    }

}
