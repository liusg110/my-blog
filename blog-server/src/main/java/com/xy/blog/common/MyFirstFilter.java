package com.xy.blog.common;

import com.xy.blog.common.Exception.AuthException;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author xiaoyao
 * @ClassName: ${type_name}
 * @Description: ${todo}(这里用一句话描述这个类的作用)
 * @date ${date} ${time}
 * ${tags}
 */
/*方式一:用注解的方式代替web.xml配置信息,同时需要在启动类中添加扫描*/
@WebFilter(filterName = "first",urlPatterns = "/m/*")
public class MyFirstFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String userid="liushoguang";
//        String userid=null;
        /*用Threadlocal的方式保存用户的关键信息，对实时性要求高的数据保存适用*/
        ContractUser.setUserId(userid);
        /*if(null==userid){
            //throw new RuntimeException("用户状态错误");
            throw new AuthException("500","用户状态错误");

        }*/
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {
        //fixme 此处没有执行destroy方法，
        ContractUser.remove();  //销毁逻辑实际上没有实际意义
    }
}
