package com.hnguigu.spring.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

public class LogAdvice implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("开始记录日志");

        System.out.println("returnValue:" + returnValue);
        System.out.println("method:" + method);
        System.out.println("args:" + Arrays.toString(args));
        System.out.println("target:" + target);
    }
}
