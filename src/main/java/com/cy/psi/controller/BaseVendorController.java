package com.cy.psi.controller;

import com.cy.psi.entity.BaseVendor;
import com.cy.psi.service.BaseVendorService;
import com.cy.psi.vo.form.BaseVendorQueryForm;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
@CrossOrigin
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

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/baseVendor/one")
    public BaseVendor selectOne(String id) {
        return this.baseVendorService.queryById(id);
    }

    /**
     * 查询所有数据
     *
     * @param baseVendorQueryForm 实例对象
     * @return 实例对象
     */
    @GetMapping("/All")
    public PageInfo<BaseVendor> queryAll(BaseVendorQueryForm baseVendorQueryForm) {

        return this.baseVendorService.queryAll(baseVendorQueryForm);
    }

    /**
     * 根据查询条件搜索数据
     *
     * @param baseVendorQueryForm
     * @return 对象列表
     */
    @GetMapping("/search")
    public PageInfo<BaseVendor> queryBySearch(BaseVendorQueryForm baseVendorQueryForm) {

        return this.baseVendorService.queryBySearch(baseVendorQueryForm);
    }

    /**
     * 根据查询条件筛选数据
     *
     * @param baseVendorQueryForm
     * @return 对象列表
     */
    @GetMapping("/baseVendor/screen")
    public PageInfo<BaseVendor> queryByScreen(BaseVendorQueryForm baseVendorQueryForm) {

        return this.baseVendorService.queryByScreen(baseVendorQueryForm);
    }

    /**
     * 新增数据
     *
     * @param baseVendor 实例对象
     * @return 实例对象
     */
    @PostMapping("/baseVendor")
    public BaseVendor insert(@RequestBody BaseVendor baseVendor) {

        return this.baseVendorService.insert(baseVendor);
    }

    /**
     * 修改数据
     *
     * @param baseVendor 实例对象
     * @return 实例对象
     */
    @PutMapping("/baseVendor")
    public BaseVendor update(@RequestBody BaseVendor baseVendor) {
        return this.baseVendorService.update(baseVendor);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @DeleteMapping("/baseVendor")
    public boolean deleteById(String id) {
        return this.baseVendorService.deleteById(id);
    }


}
