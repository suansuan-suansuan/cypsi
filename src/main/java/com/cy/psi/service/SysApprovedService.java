package com.cy.psi.service;

import com.cy.psi.entity.SysApproved;

import java.util.List;

/**
 * @Author Twx
 * @Date 2021/7/12 8:23
 * @Description 用户可审批业务层
 * @Since version-1.0
 */
public interface SysApprovedService {
    int insert(SysApproved record);

    int insertSelective(SysApproved record);

    List<SysApproved> selectApproByUid(String uid);

    void deleteByUidAndAppro(SysApproved record);
}
