package com.sc.core.cloudclient.common.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author YanXin
 * @Date 2021/7/12
 **/
public class Interceptor implements HandlerInterceptor {

    /*public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object object, Exception exception)
            throws Exception {
        // TODO Auto-generated method stub
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object object, ModelAndView view)
            throws Exception {
        // TODO Auto-generated method stub
    }

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {

        response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
        response.setHeader("Access-Control-Allow-Methods", "*");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,content-type,Accept");
        System.err.println("------------------>:已完成跨域处理");
        return true;
    }*/

}
