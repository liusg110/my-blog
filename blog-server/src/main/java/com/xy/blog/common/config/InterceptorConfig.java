package com.xy.blog.common.config;

import com.xy.blog.common.intercepter.MyIntercetor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/* fixme WebConfigurer需要实现 WebMvcConfigurer 这个接口，并实现里面的两个方法。
（在老版本的 spring-boot 中使用的是WebMvcConfigurerAdapter，新版本中已过时！！！
   还有不能通过继承 WebMvcConfigurationSupport 这个类来实现，这样会在某些情况下导致自动配置的靜態資源失效），
   第二个 addInterceptors 方法用来注册添加拦截器。*/
//WebMvcAutoConfiguration 类上有条件注解：当没有WebMvcConfigurationSupport时才会生效 ，所以尽量避免使用继承WebMvcConfigurationSupport实现拦截器，非要使用请重写对应的今天资源注册方法

/*@Configuration
public class InterceptorConfig extends WebMvcConfigurationSupport {

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyIntercetor()).addPathPatterns("/m/**");
        super.addInterceptors(registry);
    }
}*/

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyIntercetor()).addPathPatterns("/m/**");
       // super.addInterceptors(registry);
    }
}