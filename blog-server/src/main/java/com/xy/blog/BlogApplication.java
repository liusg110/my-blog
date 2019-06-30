package com.xy.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@ServletComponentScan(basePackages = {"com.xy.blog.common"})
public class BlogApplication {
/*    SpringBootApplication 上使用@ServletComponentScan 注解后
    Servlet可以直接通过@WebServlet注解自动注册
    Filter可以直接通过@WebFilter注解自动注册
    Listener可以直接通过@WebListener 注解自动注册*/


    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }

}
