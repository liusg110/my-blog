package com.xy.blog.utils;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author xiaoyao
 * @ClassName: ${type_name}
 * @Description: ${todo}(这里用一句话描述这个类的作用)
 * @date ${date} ${time}
 * ${tags}
 */
@Component
public class Test2 {
    static{
        System.out.println("---static--");
    }
    @PostConstruct
    public static void haha(){
        System.out.println("hahaha");
    }
}
