package com.hnguigu.spring.advice;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

public class ExceptionAdvice implements ThrowsAdvice {

    public void afterThrowing(Method method, Object[] args, Object target, Exception ex) {
        System.out.println("方法：" + method.getName() + "抛出异常：" + ex);
    }
}
