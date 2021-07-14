package com.cy.psi.dao;

import com.cy.psi.entity.SysApproved;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author Twx
 * @Date 2021/7/12 8:27
 * @Description 用户可审批数据访问层
 * @Since version-1.0
 */
@Repository
@Mapper
public interface SysApprovedDao {
    int insert(SysApproved record);

    int insertSelective(SysApproved record);

    List<SysApproved> selectApproByUid(String uid);

    void deleteByUidAndAppro(SysApproved record);
}