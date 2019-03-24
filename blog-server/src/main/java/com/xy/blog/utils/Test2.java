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
    //静态代码块会在依赖注入后自动执行,并优先执行
    static{
        System.out.println("---static--");
    }
    /**
     *  @Postcontruct’在依赖注入完成后自动调用
     */
    @PostConstruct
    public static void haha(){
        System.out.println("@Postcontruct’在依赖注入完成后自动调用");
    }
}
