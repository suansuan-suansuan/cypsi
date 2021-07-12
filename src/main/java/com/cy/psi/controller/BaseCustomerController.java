package com.cy.psi.controller;

import com.cy.psi.entity.BaseCustomer;
import com.cy.psi.vo.form.BaseCustomerQueryForm;
import com.cy.psi.service.BaseCustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * (BaseCustomer)表控制层
 *
 * @author makejava
 * @since 2021-07-12 17:34:50
 */
@RestController
@CrossOrigin
@Slf4j
public class BaseCustomerController {
    /**
     * 服务对象
     */
    @Resource
    private BaseCustomerService baseCustomerService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/baseCustomer/one")
    public BaseCustomer selectOne(Integer id) {
        return this.baseCustomerService.queryById(id);
    }

    /**
     * 查询所有数据
     *
     * @param baseCustomerQueryForm 实例对象
     * @return 实例对象
     */
    @GetMapping("/baseCustomer")
    public PageInfo<BaseCustomer> queryAll(BaseCustomerQueryForm baseCustomerQueryForm) {

        return this.baseCustomerService.queryAll(baseCustomerQueryForm);
    }

    /**
     * 根据查询条件搜索数据
     *
     * @param baseCustomerQueryForm
     * @return 对象列表
     */
    @GetMapping("/baseCustomer/search")
    public PageInfo<BaseCustomer> queryBySearch(BaseCustomerQueryForm baseCustomerQueryForm) {

        return this.baseCustomerService.queryBySearch(baseCustomerQueryForm);
    }

    /**
     * 根据查询条件筛选数据
     *
     * @param baseCustomerQueryForm
     * @return 对象列表
     */
    @GetMapping("/baseCustomer/screen")
    public PageInfo<BaseCustomer> queryByScreen(BaseCustomerQueryForm baseCustomerQueryForm) {

        return this.baseCustomerService.queryByScreen(baseCustomerQueryForm);
    }

    /**
     * 新增数据
     *
     * @param baseCustomer 实例对象
     * @return 实例对象
     */
    @PostMapping("/baseCustomer")
    public BaseCustomer insert(@RequestBody BaseCustomer baseCustomer) {

        return this.baseCustomerService.insert(baseCustomer);
    }

    /**
     * 修改数据
     *
     * @param baseCustomer 实例对象
     * @return 实例对象
     */
    @PutMapping("/baseCustomer")
    public BaseCustomer update(@RequestBody BaseCustomer baseCustomer) {
        return this.baseCustomerService.update(baseCustomer);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @DeleteMapping("/baseCustomer")
    public boolean deleteById(Integer id) {
        return this.baseCustomerService.deleteById(id);
    }

    /**
     * 批量删除数据
     *
     * @param ids 主键列表
     * @return 是否成功
     */
    @DeleteMapping("/baseCustomer/batch")
    public boolean deleteBatch(@RequestBody List<Integer> ids) {
        return this.baseCustomerService.deleteBatch(ids);
    }
}
