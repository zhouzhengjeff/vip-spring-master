package com.hnguigu.spring.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class TransactionAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        // 前处理
        System.out.println("开始事务");

        // 调用业务逻辑（类似于请求向下传递）
        Object returnValue = invocation.proceed();

        // 后处理
        System.out.println("提交事务");
        return returnValue;
    }
}
