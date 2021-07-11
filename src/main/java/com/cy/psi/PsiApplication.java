package com.cy.psi;

import com.cy.psi.utils.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author 皮皮虾
 */
@SpringBootApplication(scanBasePackages = "com.cy.psi")
@EnableAspectJAutoProxy(exposeProxy = true)
public class PsiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PsiApplication.class, args);
    }

    @Bean
    public IdWorker idWorker(){
        return new IdWorker();
    }

}
