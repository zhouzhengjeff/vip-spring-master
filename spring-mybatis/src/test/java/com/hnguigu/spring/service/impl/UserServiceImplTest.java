package com.hnguigu.spring.service.impl;

import com.github.pagehelper.PageInfo;
import com.hnguigu.spring.entity.User;
import com.hnguigu.spring.service.DepartmentService;
import com.hnguigu.spring.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class UserServiceImplTest {

    private ApplicationContext context;
    private UserService userService;

    @Before
    public void setUp() throws Exception {
        this.context = new ClassPathXmlApplicationContext("applicationContext.xml");
        this.userService = (UserService) context.getBean("userService");
    }

    @Test
    public void testFindPagination() {
        PageInfo<User> pageInfo = this.userService.findPagination(2, 3);

        System.out.println(pageInfo);

        pageInfo = this.userService.findPagination(2, 3);



    }
}