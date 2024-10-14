package com.hnguigu.spring.service.impl;

import com.hnguigu.spring.entity.User;
import com.hnguigu.spring.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImplTest {

    private ApplicationContext context;
    private UserService userService;

    @Before
    public void setUp() throws Exception {
        this.context = new ClassPathXmlApplicationContext("applicationContext.xml");
        this.userService = (UserService) this.context.getBean("userService");
    }

    @Test
    public void testAddUser() {
        this.userService.addUser(new User());
    }

    @Test
    public void testFindUserById() {
        User user = this.userService.findUserById(1L);
        System.out.println(user);
    }

    @Test
    public void modifyUser() {
    }
}