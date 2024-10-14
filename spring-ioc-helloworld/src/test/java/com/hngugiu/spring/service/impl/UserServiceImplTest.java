package com.hngugiu.spring.service.impl;

import com.hngugiu.spring.entity.User;
import com.hngugiu.spring.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class UserServiceImplTest {

    private UserService userService;

    @Before
    public void setUp() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        this.userService = (UserService) context.getBean("userService");
    }

    @Test
    public void testAddUser() {
        User user = new User();
        user.setId(1);
        user.setName("zhangsan");
        this.userService.addUser(user);
    }
}