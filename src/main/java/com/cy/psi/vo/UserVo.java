package com.cy.psi.vo;

import com.cy.psi.entity.SysMenu;
import com.cy.psi.entity.SysUser;
import lombok.Data;

import java.util.List;


@Data
public class UserVo {
    private boolean isValidate;
    private SysUser user;
    private List<SysMenu> menus;
}