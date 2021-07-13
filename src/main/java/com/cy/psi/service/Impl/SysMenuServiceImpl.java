package com.cy.psi.service.Impl;

import com.cy.psi.dao.SysMenuDao;
import com.cy.psi.entity.SysMenu;
import com.cy.psi.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysMenuServiceImpl implements SysMenuService {

    @Autowired
    private SysMenuDao sysMenuDao;

    @Override
    public int deleteByPrimaryKey(String menuId) {
        return sysMenuDao.deleteByPrimaryKey(menuId);
    }


    @Override
    public int insert(SysMenu record) {
        return sysMenuDao.insert(record);
    }

    @Override
    public int insertSelective(SysMenu record) {
        return sysMenuDao.insertSelective(record);
    }

    /**
     * @Author Twx
     * @Date 2021/7/12 22:00
     * @Description 根据ID查询菜单
     * @Param [menuId]
     * @Return com.cy.psi.entity.SysMenu
     * @Since version-1.0
     */
    @Override
    public SysMenu selectByPrimaryKey(String menuId) {
        return sysMenuDao.selectByPrimaryKey(menuId);
    }

    @Override
    public int updateByPrimaryKeySelective(SysMenu record) {
        return sysMenuDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysMenu record) {
        return sysMenuDao.updateByPrimaryKey(record);
    }

    /**
     * @Author Twx
     * @Date 2021/7/12 22:04
     * @Description 查询所有菜单
     * @Since version-1.0
     */
    @Override
    public List<SysMenu> selectAllMenu() {
        return sysMenuDao.selectAllMenu();
    }
}
