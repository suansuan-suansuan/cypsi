package com.cy.psi.service.Impl;

import com.cy.psi.entity.SysApproved;
import com.cy.psi.entity.SysUser;
import com.cy.psi.service.SysApprovedService;
import com.cy.psi.service.SysUserAllService;
import com.cy.psi.service.SysUserService;
import com.cy.psi.vo.SysUserReqVo;
import com.cy.psi.vo.SysUserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author Twx
 * @Date 2021/7/12 8:40
 * @Description 用户所有操作业务实现层
 * @Since version-1.0
 */
@Service
public class SysUserAllServiceImpl implements SysUserAllService {
    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private SysApprovedService sysApprovedService;


    /**
     * @Author Twx
     * @Date 2021/7/12 14:44
     * @Description 添加所有用户
     * @Param [sysUserReqVo]
     * @Return int
     * @Since version-1.0
     */
    @Transactional
    @Override
    public int addUser(SysUserReqVo sysUserReqVo) {
        //根据返回信息创建用户对象
        SysUser user=new SysUser(sysUserReqVo);
        //保存用户对象
        sysUserService.insert(user);

        //批量保存用户审批对象
        for (String approvedId : sysUserReqVo.getApprovedIds()) {
            SysUser sysUser = sysUserService.selectByPrimaryKey(approvedId);
            System.out.println("-======="+sysUser);
            SysApproved sysApproved = new SysApproved();

            sysApproved.setUId(sysUserReqVo.getUId());
            sysApproved.setApprovedUId(approvedId);
            sysApproved.setApprovedUName(sysUser.getUName());

            sysApprovedService.insert(sysApproved);
        }
        return 1;
    }

    /**
     * 修改用户
     * */
    @Override
    @Transactional
    public void updateUser(SysUserReqVo sysUserReqVo) {
        SysUser sysUser = new SysUser(sysUserReqVo);
        //修改用户信息
        sysUserService.updateByPrimaryKeySelective(sysUser);

        List<SysApproved> sysApproveds = sysApprovedService.selectApproByUid(sysUser.getUId());
        //删除当前用户所有的可审批的人
        for (SysApproved sysApproved : sysApproveds) {
            sysApprovedService.deleteByUidAndAppro(sysApproved);
        }

        for (String approvedId : sysUserReqVo.getApprovedIds()) {
            SysUser sysUser2 = sysUserService.selectByPrimaryKey(approvedId);
            //重新插入当前用户所有的可审批的人
            SysApproved sysApproved = new SysApproved();
            sysApproved.setUId(sysUserReqVo.getUId());
            sysApproved.setApprovedUId(approvedId);
            sysApproved.setApprovedUName(sysUser2.getUName());
            sysApprovedService.insert(sysApproved);
        }


    }

    /**
     * 查询所有用户的所有信息
     * */
    @Override
    public List<SysUserVo> findAllUser() {
        return sysUserService.findAllUser();
    }

    /**
     * 删除用户
     * */
    @Transactional
    @Override
    public void delUser(String uId) {

        List<SysApproved> sysApproveds = sysApprovedService.selectApproByUid(uId);
        //删除当前用户所有的可审批的人
        for (SysApproved sysApproved : sysApproveds) {
            sysApprovedService.deleteByUidAndAppro(sysApproved);
        }

        sysUserService.deleteByPrimaryKey(uId);
    }
}
