package com.hnguigu.spring.service.impl;

import com.hnguigu.spring.entity.User;
import com.hnguigu.spring.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class UserServiceImplTest {

    private ApplicationContext context;
    private UserService userService;

    @Before
    public void setUp() throws Exception {
        this.context = new ClassPathXmlApplicationContext("applicationContext.xml");
        this.userService = (UserService) context.getBean("userService");
    }

    @Test
    public void testAddUser() {
        User user = new User();
        user.setId(2L);
        user.setName("lisi");
        user.setPassword("admin");
        user.setSalary(45.34F);
        user.setBirthday(new Date());

        this.userService.addUser(user);
    }

    @Test
    public void testDeleteUser() {
        User user = this.userService.findUserById(4L);
        this.userService.deleteUser(user);
    }

    @Test
    public void modifyUser() {
        User user = this.userService.findUserById(5L);
        user.setName("abc");
        user.setPassword("test");
        this.userService.modifyUser(user);
    }

    @Test
    public void findUserById() {
        User user = this.userService.findUserById(5L);
        System.out.println(user);
    }

    @Test
    public void findAllUsers() {
        this.userService.findAllUsers().stream().forEach(System.out::println);
    }
}