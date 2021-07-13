package com.cy.psi.service;

import java.util.List;

public interface SysUserRoleService {

    List<String> queryRoleIdbyUserId(String userId);
}
