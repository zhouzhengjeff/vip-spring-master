package com.hnguigu.spring.handler;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ObjectUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TransactionHandler implements InvocationHandler {

    private Object targetObject;

    public TransactionHandler() {
    }

    public TransactionHandler(Object targetObject) {
        this.targetObject = targetObject;
    }

    /**
     * 创建代理对象
     * 代理对象如何创建？   依赖目标对象
     *
     * @return
     */
    public Object createProxyInstance() {
        return Proxy.newProxyInstance(this.targetObject.getClass().getClassLoader(),
                this.targetObject.getClass().getInterfaces(), this);
    }

    /**
     * @param proxy  代理对象
     * @param method 调用的那个目标对象上的方法 addUser()
     * @param args   调用的那个目标对象上的方法addUser(User user)的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if (ObjectUtils.isEmpty(proxy)) {
            throw new IllegalArgumentException("proxy is null");
        }

        if (ObjectUtils.isEmpty(method)) {
            throw new IllegalArgumentException("method is null");
        }

        if (ArrayUtils.isEmpty(args)) {
            throw new IllegalArgumentException("proxy is null");
        }

        beginTransaction();

        Object returnObj = method.invoke(targetObject, args);

        commitTransaction();

        return returnObj;
    }

    public void commitTransaction() {
        System.out.println("提交事务");
    }

    public void beginTransaction() {
        System.out.println("开启事务");
    }

}
