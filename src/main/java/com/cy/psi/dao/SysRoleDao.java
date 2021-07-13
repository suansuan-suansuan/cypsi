package com.cy.psi.dao;

import com.cy.psi.entity.SysRole;
import com.cy.psi.vo.RoleMenuVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @Author Twx
 * @Date 2021/7/12 20:48
 * @Description 角色数据访问层
 * @Since version-1.0
 */
@Repository
@Mapper
public interface SysRoleDao {
    int deleteByPrimaryKey(String roleId);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(String roleId);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);

    List<SysRole> selectAllRole();

    RoleMenuVo selectRoleMenuByRoleId(String roleId);

    String  queryRoleNameByroleId(String roleId);
}