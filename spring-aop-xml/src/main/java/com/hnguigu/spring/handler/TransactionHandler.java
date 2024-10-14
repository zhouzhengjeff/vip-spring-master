package com.hnguigu.spring.handler;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ObjectUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TransactionHandler  {

    public void commitTransaction() {
        System.out.println("提交事务");
    }

    public void beginTransaction() {
        System.out.println("开启事务");
    }

}
