package com.sc.core.cloudclient.common.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * @Author YanXin
 * @Date 2021/7/12
 **/
public class RequestListenter implements ServletRequestListener {

    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {

        System.out.println("---------------------------->请求销毁");
    }

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {

        System.out.println("---------------------------->请求创建");
    }

}
