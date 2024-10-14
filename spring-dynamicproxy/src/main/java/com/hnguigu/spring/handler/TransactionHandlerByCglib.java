package com.hnguigu.spring.handler;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.InvocationHandler;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ObjectUtils;

import java.lang.reflect.Method;

public class TransactionHandlerByCglib implements InvocationHandler {

    private Object targetObject;

    public TransactionHandlerByCglib() {
    }

    public TransactionHandlerByCglib(Object targetObject) {
        this.targetObject = targetObject;
    }

    public Object createProxyInstance() {
        Enhancer enhancer = new Enhancer();
        enhancer.setCallback(this);
        // CGlib动态代理只需满足：目标对象与代理对象有一个父子关系即可
        enhancer.setSuperclass(this.targetObject.getClass());
        return enhancer.create();
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (ObjectUtils.isEmpty(proxy)) {
            throw new IllegalArgumentException("proxy is null");
        }

        if (ObjectUtils.isEmpty(method)) {
            throw new IllegalArgumentException("method is null");
        }

        if (ArrayUtils.isEmpty(args)) {
            throw new IllegalArgumentException("args is null");
        }

        beginTransaction();

        Object returnObj = method.invoke(targetObject, args);

        commitTransaction();

        return returnObj;
    }

    public void commitTransaction() {
        System.out.println("commit transaction");
    }

    public void beginTransaction() {
        System.out.println("begin transaction");
    }
}
