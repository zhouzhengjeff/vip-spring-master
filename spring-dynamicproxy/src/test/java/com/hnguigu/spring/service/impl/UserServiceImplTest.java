package com.hnguigu.spring.service.impl;

import com.hnguigu.spring.entity.User;
import com.hnguigu.spring.service.UserService;
import org.junit.Before;
import org.junit.Test;

public class UserServiceImplTest {

    private UserService userService;

    @Before
    public void setUp() {
        this.userService = new UserServiceImpl();
    }

    @Test
    public void testAddUser() {
        User user = new User();
        user.setId(1);
        user.setName("zhangsan");
        this.userService.addUser(user);
    }

    @Test
    public void deleteUser() {
    }

    @Test
    public void modifyUser() {
    }
}