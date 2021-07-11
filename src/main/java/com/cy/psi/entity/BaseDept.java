package com.cy.psi.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * base_dept
 * @author 
 */
@Data
public class BaseDept implements Serializable {
    /**
     * 部门id
     */
    private Integer deptId;

    /**
     * 父级id
     */
    private Integer parentId;

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