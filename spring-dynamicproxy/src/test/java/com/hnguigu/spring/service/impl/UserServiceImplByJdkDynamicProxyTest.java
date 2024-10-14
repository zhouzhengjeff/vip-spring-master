package com.hnguigu.spring.service.impl;

import com.hnguigu.spring.entity.User;
import com.hnguigu.spring.handler.TransactionHandler;
import com.hnguigu.spring.service.UserService;
import org.junit.Before;
import org.junit.Test;

public class UserServiceImplByJdkDynamicProxyTest {

    private UserService userService;

    private TransactionHandler transactionHandler;


    @Before
    public void setUp() throws Exception {
        // 实例化目标对象
        UserServiceImplByDynamicProxy userServiceImplByDynamicProxy = new UserServiceImplByDynamicProxy();

        // 实例化事务处理器
        this.transactionHandler = new TransactionHandler(userServiceImplByDynamicProxy);

        // 创建代理对象
        // 代理对象与目标对象必须满足实现相同接口
        this.userService = (UserService) this.transactionHandler.createProxyInstance();
    }

    @Test
    public void addUser() {
        this.userService.addUser(new User());
    }

    @Test
    public void deleteUser() {
        this.userService.deleteUser(new User());
    }
}