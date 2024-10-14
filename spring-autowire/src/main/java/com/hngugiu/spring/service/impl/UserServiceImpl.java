package com.hngugiu.spring.service.impl;

import com.hngugiu.spring.dao.UserDao;
import com.hngugiu.spring.entity.User;
import com.hngugiu.spring.service.UserService;
import org.springframework.util.ObjectUtils;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser(User user) {
        if (ObjectUtils.isEmpty(user)) {
            throw new IllegalArgumentException("user is null");
        }

        this.userDao.save(user);
    }
}
