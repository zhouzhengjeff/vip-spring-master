package com.hnguigu.spring.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 前置通知
 */
public class AuthenticateAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("开始进行认证");
        System.out.println("before method: " + method.getName());
        System.out.println("before method 的参数: " + Arrays.toString(args));
        System.out.println("目标对象为：" + target);
    }
}
