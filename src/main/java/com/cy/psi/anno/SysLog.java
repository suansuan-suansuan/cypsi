package com.cy.psi.anno;

import java.lang.annotation.*;

/**
 * @Author Twx
 * @Date 2021/7/11 9:51
 * @Description 系统日志注解
 * @Since version-1.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysLog {
    String value() default "";
}
