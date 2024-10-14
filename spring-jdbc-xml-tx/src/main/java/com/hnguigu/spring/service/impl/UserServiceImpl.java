package com.hnguigu.spring.service.impl;


import com.hnguigu.spring.dao.UserDao;
import com.hnguigu.spring.entity.User;
import com.hnguigu.spring.service.UserService;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

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

    @Override
    public void deleteUser(User user) {
        if (ObjectUtils.isEmpty(user)) {
            throw new IllegalArgumentException("user is null");
        }

        this.userDao.delete(user);
    }

    @Override
    public void modifyUser(User user) {
        if (ObjectUtils.isEmpty(user)) {
            throw new IllegalArgumentException("user is null");
        }
        this.userDao.update(user);
    }

    @Override
    public User findUserById(Long id) {
        if (ObjectUtils.isEmpty(id)) {
            throw new IllegalArgumentException("id is null");
        }

        return this.userDao.findById(id);

    }

    @Override
    public List<User> findAllUsers() {
        return this.userDao.findAll();
    }

}
