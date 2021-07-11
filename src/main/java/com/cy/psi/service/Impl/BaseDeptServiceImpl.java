package com.cy.psi.service.Impl;

import com.cy.psi.dao.BaseDeptDao;
import com.cy.psi.entity.BaseDept;
import com.cy.psi.service.BaseDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Twx
 * @Date 2021/7/11 15:28
 * @Description 部门业务访问层
 * @Since version-1.0
 */
@Service
public class BaseDeptServiceImpl implements BaseDeptService {
    @Autowired
    private BaseDeptDao baseDeptDao;


    /**
     * @Author Twx
     * @Date 2021/7/11 16:38
     * @Description 根据ID删除部门
     * @Param [deptId]
     * @Return int
     * @Since version-1.0
     */
    @Override
    public int deleteByPrimaryKey(Integer deptId) {
        return baseDeptDao.deleteByPrimaryKey(deptId);
    }

    /**
     * @Author Twx
     * @Date 2021/7/11 16:38
     * @Description 添加部门
     * @Param [record]
     * @Return int
     * @Since version-1.0
     */
    @Override
    public int insert(BaseDept record) {
        return baseDeptDao.insert(record);
    }

    /**
     * @Author Twx
     * @Date 2021/7/11 16:38
     * @Description 条件添加部门
     * @Param [record]
     * @Return int
     * @Since version-1.0
     */
    @Override
    public int insertSelective(BaseDept record) {
        return baseDeptDao.insertSelective(record);
    }

    /**
     * @Author Twx
     * @Date 2021/7/11 16:39
     * @Description 根据ID查询部门
     * @Param [deptId]
     * @Return com.cy.psi.entity.BaseDept
     * @Since version-1.0
     */
    @Override
    public BaseDept selectByPrimaryKey(Integer deptId) {
        return baseDeptDao.selectByPrimaryKey(deptId);
    }

    /**
     * @Author Twx
     * @Date 2021/7/11 16:39
     * @Description 根据ID条件修改部门
     * @Param [record]
     * @Return int
     * @Since version-1.0
     */
    @Override
    public int updateByPrimaryKeySelective(BaseDept record) {
        return baseDeptDao.updateByPrimaryKeySelective(record);
    }

    /**
     * @Author Twx
     * @Date 2021/7/11 16:39
     * @Description 根据ID修改部门
     * @Param [record]
     * @Return int
     * @Since version-1.0
     */
    @Override
    public int updateByPrimaryKey(BaseDept record) {
        return baseDeptDao.updateByPrimaryKey(record);
    }

    /**
     * @Author Twx
     * @Date 2021/7/11 16:59
     * @Description 查询所有部门
     * @Param []
     * @Return java.util.List<com.cy.psi.entity.BaseDept>
     * @Since version-1.0
     */
    @Override
    public List<BaseDept> findAllDept() {
        return baseDeptDao.findAllDept();
    }

    @Override
    public Object findMaxId(int parent) {
        return baseDeptDao.findMaxId(parent);
    }
}
