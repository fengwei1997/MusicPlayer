package com.utils;

import com.model.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.transform.Source;

public class UserLoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
        //获取请求的RUi:去除http:localhost:8080这部分剩下的
        System.out.println("handpre处理函数前");
        String requestUri=request.getRequestURI();
        //UTL:除了login.jsp是可以公开访问的，其他的URL都进行拦截控制
        if(requestUri.indexOf("/login")<=0) {
            HttpSession session=request.getSession();
            User user= (User) session.getAttribute("loginUser");
            if(user!=null){
                return true;
            }else {
                request.getRequestDispatcher("/login.jsp").forward(request,response);
                return false;
            }
        }else{
            System.out.println("handpre处理函数后");
            return true;
        }

    }
}
