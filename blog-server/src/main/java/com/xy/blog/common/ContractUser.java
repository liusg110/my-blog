package com.xy.blog.common;

import java.io.Serializable;

/**
 * @author xiaoyao
 * @ClassName: ${type_name}
 * @Description: ${todo}(这里用一句话描述这个类的作用)
 * @date ${date} ${time}
 * ${tags}
 */
public class ContractUser implements Serializable {
    private static ThreadLocal<String> userIdThreadLocal=new ThreadLocal<>();

    public static void setUserId(String userId){
        userIdThreadLocal.set(userId);
    }
    public static String getUserId(){
        return userIdThreadLocal.get();
    }

    public static void remove(){
        userIdThreadLocal.remove();
    }
}
