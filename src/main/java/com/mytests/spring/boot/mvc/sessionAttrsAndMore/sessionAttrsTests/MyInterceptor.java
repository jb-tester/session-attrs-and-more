package com.mytests.spring.boot.mvc.sessionAttrsAndMore.sessionAttrsTests;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 11/8/2019.
 * Project: session-attrs-and-more
 * *******************************
 */
public class MyInterceptor extends HandlerInterceptorAdapter {

    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler)
            throws Exception {

        long startTime = System.currentTimeMillis();
        request.setAttribute("start", startTime);
        request.getSession().setAttribute("globalSessionAttr1", "globalSA1");
        request.getSession().setAttribute("globalSessionAttr2", "globalSA2");
        return true;
    }

    //after the handler is executed
    public void postHandle(
            HttpServletRequest request, HttpServletResponse response,
            Object handler, ModelAndView modelAndView)
            throws Exception {

        long startTime = (Long) request.getAttribute("start");

        long endTime = System.currentTimeMillis();

        long executeTime = endTime - startTime;


        modelAndView.addObject("duration", executeTime);

    }
}
