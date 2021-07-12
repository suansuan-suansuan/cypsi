package com.cy.psi.service.Impl;

import com.cy.psi.dao.SysApprovedDao;
import com.cy.psi.entity.SysApproved;
import com.cy.psi.service.SysApprovedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Twx
 * @Date 2021/7/12 8:26
 * @Description 用户可审批业务实现层
 * @Since version-1.0
 */
@Service
public class SysApprovedServiceImpl implements SysApprovedService {

    @Autowired
    private SysApprovedDao sysApprovedDao;

    @Override
    public int insert(SysApproved record) {
        return sysApprovedDao.insert(record);
    }

    @Override
    public int insertSelective(SysApproved record) {
        return sysApprovedDao.insertSelective(record);
    }

    @Override
    public List<SysApproved> selectApproByUid(String uid) {
        return sysApprovedDao.selectApproByUid(uid);
    }

    @Override
    public void deleteByUidAndAppro(SysApproved record) {
        sysApprovedDao.deleteByUidAndAppro(record);
    }
}
