package com.cy.psi;

import com.cy.psi.utils.IdWorker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.env.Environment;

/**
 * @author 皮皮虾
 */
@SpringBootApplication(scanBasePackages = "com.cy.psi")
@EnableAspectJAutoProxy(exposeProxy = true)
public class PsiApplication {
    private static final Logger LOG = LoggerFactory.getLogger(PsiApplication.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(PsiApplication.class);
        Environment env = app.run(args).getEnvironment();
        LOG.info("启动成功！！");
        LOG.info("进销存后端地址: \thttp://127.0.0.1:{}", env.getProperty("server.port"));
    }


    @Bean
    public IdWorker idWorker(){
        return new IdWorker();
    }

}
