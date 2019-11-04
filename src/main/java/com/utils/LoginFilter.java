package com.utils;

import com.model.User;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request1=(HttpServletRequest) request;
        HttpServletResponse response1=(HttpServletResponse) response;
        String uri=request1.getRequestURI();
        System.out.println("过滤器:"+uri);
        //登录界面无需过滤
        if(uri.contains("login.jsp")){
            System.out.println("登录界面无需过滤前");
            chain.doFilter(request, response);
            System.out.println("登录界面无需过滤后");
            return;
        }
        //获取用户信息
        User user= (User) request.getAttribute("userLogin");
        if(user==null){
            System.out.println("过滤器:user为空,页面请求转发到登录页面");
           response1.sendRedirect("/login.jsp");
        }else {
            System.out.println("用户已经登录");
            chain.doFilter(request, response);
        }
    }

    @Override
    public void destroy() {

    }
}
