package com.cy.psi.controller;

import com.cy.psi.entity.Allotwarehouse;
import com.cy.psi.entity.SaleDelivery;
import com.cy.psi.service.OutwarehouseService;
import com.cy.psi.vo.OutwarehouseAuditVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SaleDelivery)表控制层
 *
 * @author makejava
 * @since 2021-07-11 14:16:38
 */
@Slf4j
@RestController
//跨域注释
@CrossOrigin
public class OutwarehouseController {
    /**
     * 服务对象
     */
    @Resource
    private OutwarehouseService saleDeliveryService;

    //分页查询调拨单
    @GetMapping("/selectOutwarehouse")
    public PageInfo<SaleDelivery> selectOutwarehouse (@RequestParam("currentPage") Integer currentPage, @RequestParam("pagesize") Integer pagesize){
        log.debug("分页查询信息");
        PageHelper.startPage(currentPage,pagesize);
        log.debug("---------------------------------------------------");
        List<SaleDelivery> entityPage =saleDeliveryService.selectOutwarehouse();
        PageInfo<SaleDelivery> classtypeVoPageInfo = new  PageInfo<>(entityPage);
        return classtypeVoPageInfo;
    }

    //     高级分页查询调拨单
    @GetMapping("/selectBylikeOutwarehouse")
    public PageInfo<SaleDelivery> selectBylikeOutwarehouse(@RequestParam("currentPage") int currentPage,
                                                               @RequestParam("pagesize") int pagesize,
                                                               @RequestParam(value ="Starttime",required = false) String Starttime,
                                                               @RequestParam(value ="Endtime",required = false) String Endtime,
                                                               @RequestParam(value ="salesmen",required = false) String salesmen,
                                                               @RequestParam(value ="remarks",required = false) String remarks){
        List<SaleDelivery> entityPage =saleDeliveryService.selectBylikeOutwarehouse(Starttime,Endtime,salesmen,remarks);
        PageHelper.startPage(currentPage,pagesize);
        PageInfo<SaleDelivery> classtypeVoPageInfo = new  PageInfo<>(entityPage);
        return classtypeVoPageInfo;
    }

    //    审核    出库单
    @PutMapping("/OutwarehouseAudit")
    public Integer OutwarehouseAudit(@RequestBody OutwarehouseAuditVo vo){
        log.info("approvalTime:"+vo.getApprovalTime());
        log.info("approvalState:"+vo.getApprovalState());
        log.info("deliveryOrderId:"+vo.getDeliveryOrderId());
        log.debug("修改想去");
        return saleDeliveryService.OutwarehouseAudit(vo.getApprovalState(),vo.getApprovalTime(),vo.getDeliveryOrderId());
    }
    @DeleteMapping("/delOutwarehouse")
    public String delOutwarehouse(@PathVariable("deliveryOrderId") String deliveryOrderId){
        log.debug("开始删除！");
        log.debug(String.valueOf(deliveryOrderId));
        saleDeliveryService.deleteById(deliveryOrderId);
        return "删除成功!";
    }
}
