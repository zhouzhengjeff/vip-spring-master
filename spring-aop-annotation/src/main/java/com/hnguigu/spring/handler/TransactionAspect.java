package com.hnguigu.spring.handler;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component

// 切面
@Aspect
public class TransactionAspect {

    /**
     * 后置通知
     */
    @After("execution(* com.hnguigu.spring.service.*.*(..))")
    public void commitTransaction() {
        System.out.println("提交事务");
    }

    /**
     * 前通知
     */
    @Before("execution(* com.hnguigu.spring.service.*.*(..))")
    public void beginTransaction() {
        System.out.println("开启事务");
    }

}
