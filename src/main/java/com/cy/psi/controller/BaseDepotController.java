package com.cy.psi.controller;

import com.cy.psi.entity.BaseDepot;
import com.cy.psi.entity.BaseVendor;
import com.cy.psi.vo.form.BaseDepotQueryForm;
import com.cy.psi.service.BaseDepotService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * (BaseDepot)表控制层
 *
 * @author makejava
 * @since 2021-07-12 18:19:52
 */
@RestController
@CrossOrigin
@Slf4j
@RequestMapping("BaseDepotController")
public class BaseDepotController {
    /**
     * 服务对象
     */
    @Resource
    private BaseDepotService baseDepotService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/baseDepot/one")
    public BaseDepot selectOne(String id) {
        return this.baseDepotService.queryById(id);
    }


    @GetMapping("/queryAllWWWW")
    public List<BaseDepot> selectAll100(){
        List<BaseDepot> Bacv =baseDepotService.queryAllWWWW();
        return Bacv;
    }
    /**
     * 查询所有数据
     *
     * @param baseDepotQueryForm 实例对象
     * @return 实例对象
     */
    @GetMapping("/baseDepot")
    public PageInfo<BaseDepot> queryAll(BaseDepotQueryForm baseDepotQueryForm) {

        return this.baseDepotService.queryAll(baseDepotQueryForm);
    }

    /**
     * 根据查询条件搜索数据
     *
     * @param baseDepotQueryForm
     * @return 对象列表
     */
    @GetMapping("/baseDepot/search")
    public PageInfo<BaseDepot> queryBySearch(BaseDepotQueryForm baseDepotQueryForm) {

        return this.baseDepotService.queryBySearch(baseDepotQueryForm);
    }

    /**
     * 根据查询条件筛选数据
     *
     * @param baseDepotQueryForm
     * @return 对象列表
     */
    @GetMapping("/baseDepot/screen")
    public PageInfo<BaseDepot> queryByScreen(BaseDepotQueryForm baseDepotQueryForm) {

        return this.baseDepotService.queryByScreen(baseDepotQueryForm);
    }

    /**
     * 新增数据
     *
     * @param baseDepot 实例对象
     * @return 实例对象
     */
    @PostMapping("/baseDepot")
    public BaseDepot insert(@RequestBody BaseDepot baseDepot) {

        return this.baseDepotService.insert(baseDepot);
    }

    /**
     * 修改数据
     *
     * @param baseDepot 实例对象
     * @return 实例对象
     */
    @PutMapping("/baseDepot")
    public BaseDepot update(@RequestBody BaseDepot baseDepot) {
        return this.baseDepotService.update(baseDepot);
    }


    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @DeleteMapping("/baseDepot")
    public boolean deleteById(String id) {
        return this.baseDepotService.deleteById(id);
    }

    /**
     * 批量删除数据
     *
     * @param ids 主键列表
     * @return 是否成功
     */
    @DeleteMapping("/baseDepot/batch")
    public boolean deleteBatch(@RequestBody List<Integer> ids) {
        return this.baseDepotService.deleteBatch(ids);
    }
}
