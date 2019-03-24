package com.xy.blog.common.config;

import com.xy.blog.common.intercepter.MyIntercetor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

//@Configuration
public class InterceptorConfig extends WebMvcConfigurationSupport {
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyIntercetor()).addPathPatterns("/m/**");
        super.addInterceptors(registry);
    }
}