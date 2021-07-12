package com.cy.psi.aspect;

import com.alibaba.fastjson.JSONObject;
import com.cy.psi.anno.SysLog;
import com.cy.psi.entity.Log;
import com.cy.psi.service.SysLogService;
import com.cy.psi.service.SysUserService;
import com.cy.psi.utils.IdWorker;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Timestamp;

/**
 * @Author Twx
 * @Date 2021/7/10 23:16
 * @Description 系统日志切面类
 * @Since version-1.0
 */
@Aspect
@Component
@Slf4j
public class SysLogAspect {

    @Autowired
    private IdWorker idWorker;

    private static String userId;

    private static String username;

    @Autowired
    private SysLogService sysLogService;

    @Autowired
    private SysUserService sysUserService;


    /**
     * 定义切点l
     */
//    @Pointcut("execution(public * com.cy.psi.controller.SysController.login(..))")
    public void getuserByUserName(){
        // this.
    }

    /**
     * 用户名密码登录时
     * @param joinPoint
     */
  //  @Before("getuserByUserName()")
    public void doBefore(JoinPoint joinPoint){
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        // 记录下请求内容
        log.info("URL : " + request.getRequestURL().toString());
        log.info("HTTP_METHOD : " + request.getMethod());
        log.info("REQUEST：" + joinPoint.getArgs().toString());
        String xx= JSONObject.toJSONString(joinPoint.getArgs());
        System.out.println(xx);
        int index=xx.indexOf("uName");//{uanem:ssss,upass}
        int index2=xx.indexOf('"'+","+'"'+"uPass");
        String cha=xx.substring(index+11,index2);
        userId=sysUserService.queryUserIdByUserName(cha);
    }
    
    /**
     * @Author Twx
     * @Date 2021/7/10 23:23
     * @Description 配置切点
     * @Param []
     * @Return void
     * @Since version-1.0
     */
    @Pointcut("@annotation(com.cy.psi.anno.SysLog)")
    public void logPointCut(){};

    /**
     * @Author Twx
     * @Date 2021/7/10 23:24
     * @Description 后置增强
     * @Param [joinPoint]
     * @Return void
     * @Since version-1.0
     */
    @AfterReturning("logPointCut()")
    public void logAfter(JoinPoint joinPoint) throws UnknownHostException {
        System.out.println("操作。。。");
        //获取注解方法
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        //获取方法上的注解
        SysLog anno = method.getAnnotation(SysLog.class);

        //创建系统日志实体类
        Log log =new Log();


        //如果方法上存在该注解，则通过实体类保存进数据库
        if (anno !=null){
            //获取用户操作并设置
            log.setOperation(anno.value());
        }
        //获取用户ip地址并设置
        String ip= InetAddress.getLocalHost().getHostAddress();
        log.setIpaddress(ip);

        //设置用户id
        log.setUId(userId);

        //设置信息
        log.setChangeInfo(username+"进行了"+ log.getOperation());

        //设置成功信息
        log.setOperationResult("执行成功");
        log.setLogId(idWorker.nextId()+"");
        log.setCreateTime(new Timestamp(System.currentTimeMillis()));
        sysLogService.addSysLog(log);
    }


    /**
     * @Author Twx
     * @Date 2021/7/11 9:20
     * @Description 执行失败
     * @Param [joinPoint]
     * @Return void
     * @Since version-1.0
     */
    @AfterThrowing("logPointCut()")
    public void logAfterThrowing(JoinPoint joinPoint) throws UnknownHostException {
        //获取注解方法
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        //获取方法上的注解
        SysLog anno = method.getAnnotation(SysLog.class);

        //创建系统日志实体类
        Log log =new Log();


        //如果方法上存在该注解，则通过实体类保存进数据库
        if (anno !=null){
            //获取用户操作并设置
            log.setOperation(anno.value());
        }
        //获取用户ip地址并设置
        String ip= InetAddress.getLocalHost().getHostAddress();
        log.setIpaddress(ip);

        //设置用户id
        log.setUId(userId);

        //设置信息
        log.setChangeInfo(username+"进行了"+ log.getOperation());

        //设置失败信息
        log.setOperationResult("执行失败");
        log.setLogId(idWorker.nextId()+"");
        log.setCreateTime(new Timestamp(System.currentTimeMillis()));
        sysLogService.addSysLog(log);
    }

}
