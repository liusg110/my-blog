package com.xy.blog.utils;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


@Component
public class TestStarted implements ServletContextAware, ServletContextListener, ApplicationRunner, CommandLineRunner {

    private static final String myflag="myflag";

    static{
        System.out.println("111111111111111111111");
    }
    /**
     * 在填充普通bean属性之后但在初始化之前调用
     * 类似于initializingbean的afterpropertiesset或自定义init方法的回调
     *
     */
    @Override
    public void setServletContext(ServletContext servletContext) {
        servletContext.setAttribute(myflag,"liuSg");
        System.out.println("执行setServletContext方法"+servletContext.getAttribute(myflag));
    }

    /**
     *Web应用程序初始化进程正在启动的通知。
     * 在初始化Web应用程序中的任何过滤器或servlet之前，将通知所有servletContextListener上下文初始化。
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //ServletContext servletContext = sce.getServletContext();
        System.out.println("执行contextInitialized方法");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }

    /**
     * 用于指示bean包含在SpringApplication中时应运行的接口。可以定义多个applicationrunner bean
     * 在同一应用程序上下文中，可以使用有序接口或order@order注释对其进行排序。
     */
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("ApplicationRunner的run方法");
    }

    /**
     * 用于指示bean包含在SpringApplication中时应运行的接口。可以在同一应用程序上下文中定义多个commandlinerunner bean，并且可以使用有序接口或@order注释对其进行排序。
     * 如果需要访问applicationArguments而不是原始字符串数组，请考虑使用applicationrunner。
     *
     */
    @Override
    public void run(String... args) throws Exception {
        System.out.println("ApplicationRunner的run方法");
    }
}
