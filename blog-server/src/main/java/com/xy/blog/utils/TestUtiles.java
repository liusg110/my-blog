package com.xy.blog.utils;

import org.springframework.beans.BeansException;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author xiaoyao
 * @Description: springBoot启动时或启动后自动执行的方法
 */
@Component
@Order(value = 1)
public class TestUtiles  implements CommandLineRunner,ApplicationRunner,ServletContextListener,ApplicationContextAware {
    //,ApplicationContextAware
    //implements  ServletContextListener,ApplicationContextAware

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("我被启动加载了");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext"); //最先执行的
    }
    @Override
    @Order(value =1)  //无效
    public void run(String... args) throws Exception {
        System.out.println("我被启动加载了222");
    }
    @Override
    @Order(value = 2)  //无效
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("我被启动加载了11111111111111");
    }


}
