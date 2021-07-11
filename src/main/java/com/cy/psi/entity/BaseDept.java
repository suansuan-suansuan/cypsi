package com.cy.psi.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * base_dept
 * @author 
 */
@Data
public class BaseDept implements Serializable {
    /**
     * 部门id
     */
    private String deptId;

    /**
     * 父级id
     */
    private String parentId;

    /**
     * 部门名称
     */
    private String dname;

    /**
     * 部门编码
     */
    private String code;

    private static final long serialVersionUID = 1L;
}