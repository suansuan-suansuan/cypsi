package com.cy.psi.vo;

import com.cy.psi.entity.SysMenu;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.awt.*;
import java.sql.Timestamp;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleMenuVo {
    private String roleId;
    private String roleName;
    private String founder;
    private Timestamp foundTime;
    private String updateBy;
    private Timestamp updateTime;
    private List<SysMenu> menus;

}
