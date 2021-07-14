package com.cy.psi.dao;

import com.cy.psi.entity.BaseDept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface BaseDeptDao {
    int deleteByPrimaryKey(Integer deptId);

    int insert(BaseDept record);

    int insertSelective(BaseDept record);

    BaseDept selectByPrimaryKey(Integer deptId);

    int updateByPrimaryKeySelective(BaseDept record);

    int updateByPrimaryKey(BaseDept record);

    List<BaseDept> findAllDept();

    Object findMaxId(int parent);

}