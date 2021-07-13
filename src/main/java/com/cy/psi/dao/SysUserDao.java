package com.cy.psi.dao;

import com.cy.psi.entity.SysMenu;
import com.cy.psi.entity.SysUser;
import com.cy.psi.vo.SysUserVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author Twx
 * @Date 2021/7/12 9:22
 * @Description 系统用户数据访问层
 * @Since version-1.0
 */
@Repository


@Mapper
public interface SysUserDao {
    int deleteByPrimaryKey(String uId);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(String uId);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);


    List<SysUserVo> findAllUser();


    String queryUserIdByUserName(String username);

    SysUser selectUserByName(@Param("username") String username);


    List<SysUser> findhaveapproved();
    List<SysMenu> usermenu(String userId);

}