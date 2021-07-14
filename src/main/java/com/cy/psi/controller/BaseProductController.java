package com.cy.psi.controller;

import com.cy.psi.entity.BaseProduct;

import com.cy.psi.vo.form.BaseProductQueryForm;

import com.cy.psi.service.BaseProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * (BaseProduct)表控制层
 *
 * @author makejava
 * @since 2021-07-12 17:52:38
 */
@RestController
@Slf4j
@CrossOrigin
@RequestMapping("baseProduct")
public class BaseProductController {
    /**
     * 服务对象
     */
    @Resource
    private BaseProductService baseProductService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/baseProduct/one")
    public BaseProduct selectOne(Integer id) {
        return this.baseProductService.queryById(id);
    }

    /**
     * 查询所有数据
     *
     * @param baseProductQueryForm 实例对象
     * @return 实例对象
     */
    @GetMapping("/baseProduct")
    public PageInfo<BaseProduct> queryAll(BaseProductQueryForm baseProductQueryForm) {

        return this.baseProductService.queryAll(baseProductQueryForm);
    }

    /**
     * 根据查询条件搜索数据
     *
     * @param baseProductQueryForm
     * @return 对象列表
     */
    @GetMapping("/baseProduct/search")
    public PageInfo<BaseProduct> queryBySearch(BaseProductQueryForm baseProductQueryForm) {

        return this.baseProductService.queryBySearch(baseProductQueryForm);
    }

    /**
     * 根据查询条件筛选数据
     *
     * @param baseProductQueryForm
     * @return 对象列表
     */
    @GetMapping("/baseProduct/screen")
    public PageInfo<BaseProduct> queryByScreen(BaseProductQueryForm baseProductQueryForm) {

        return this.baseProductService.queryByScreen(baseProductQueryForm);
    }

    /**
     * 新增数据
     *
     * @param baseProduct 实例对象
     * @return 实例对象
     */
    @PostMapping("/baseProduct")
    public BaseProduct insert(@RequestBody BaseProduct baseProduct) {

        return this.baseProductService.insert(baseProduct);
    }
    

    /**
     * 修改数据
     *
     * @param baseProduct 实例对象
     * @return 实例对象
     */
    @PutMapping("/baseProduct")
    public BaseProduct update(@RequestBody BaseProduct baseProduct) {
        return this.baseProductService.update(baseProduct);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @DeleteMapping("/baseProduct")
    public boolean deleteById(Integer id) {
        return this.baseProductService.deleteById(id);
    }

    /**
     * 批量删除数据
     *
     * @param ids 主键列表
     * @return 是否成功
     */
    @DeleteMapping("/baseProduct/batch")
    public boolean deleteBatch(@RequestBody List<Integer> ids) {
        return this.baseProductService.deleteBatch(ids);
    }

    @GetMapping("/GenJuselectAll")
    public List<BaseProduct> GenJuselectAll(){
        List<BaseProduct> Bacv =baseProductService.GenJuselectAll();
        return Bacv;
    }
}
