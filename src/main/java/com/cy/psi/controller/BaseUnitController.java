package com.cy.psi.controller;

import com.cy.psi.entity.BaseUnit;
import com.cy.psi.vo.form.BaseUnitQueryForm;
import com.cy.psi.service.BaseUnitService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * (BaseUnit)表控制层
 *
 * @author makejava
 * @since 2021-07-12 17:48:11
 */
@RestController
@CrossOrigin
@Slf4j
public class BaseUnitController {
    /**
     * 服务对象
     */
    @Resource
    private BaseUnitService baseUnitService;

    @GetMapping("/select")
    public List<BaseUnit> selectAll(){
        return this.baseUnitService.selectAll();
    }
    
}
