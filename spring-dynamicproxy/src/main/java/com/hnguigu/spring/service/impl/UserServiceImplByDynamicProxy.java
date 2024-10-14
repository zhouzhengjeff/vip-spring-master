package com.hnguigu.spring.service.impl;


import com.hnguigu.spring.dao.UserDao;
import com.hnguigu.spring.dao.impl.UserDaoImpl;
import com.hnguigu.spring.entity.User;
import com.hnguigu.spring.service.UserService;
import org.apache.commons.lang3.ObjectUtils;


public class UserServiceImplByDynamicProxy implements UserService {

    private UserDao userDao = new UserDaoImpl();


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
}
