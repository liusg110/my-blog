package com.xy.blog.common.intercepter;

import com.xy.blog.common.ContractUser;
import com.xy.blog.common.Exception.AuthException;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author xiaoyao
 * @ClassName: ${type_name}
 * @Description: ${todo}(这里用一句话描述这个类的作用)
 * @date ${date} ${time}
 * ${tags}
 */
@Component
public class MyIntercetor implements HandlerInterceptor {


    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle start...");
        String userId = ContractUser.getUserId();
        request.setAttribute("userId",userId);
        if("liushoguang".equals(userId)){

        }
            //throw  new AuthException("300","用户未登陆");
            return true;
    }

}
