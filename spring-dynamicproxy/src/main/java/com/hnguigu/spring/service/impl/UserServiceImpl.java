package com.hnguigu.spring.service.impl;


import com.hnguigu.spring.dao.UserDao;
import com.hnguigu.spring.dao.impl.UserDaoImpl;
import com.hnguigu.spring.entity.User;
import com.hnguigu.spring.service.UserService;
import org.apache.commons.lang3.ObjectUtils;


public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();

    @Override
    public void addUser(User user) {
        if (ObjectUtils.isEmpty(user)) {
            throw new IllegalArgumentException("user is null");
        }

        beginTransaction();

        this.userDao.save(user);

        commitTransaction();
    }

    @Override
    public void deleteUser(User user) {
        if (ObjectUtils.isEmpty(user)) {
            throw new IllegalArgumentException("user is null");
        }

        beginTransaction();

        this.userDao.delete(user);

        commitTransaction();
    }

    @Override
    public void modifyUser(User user) {
        if (ObjectUtils.isEmpty(user)) {
            throw new IllegalArgumentException("user is null");
        }

        beginTransaction();

        this.userDao.update(user);

        commitTransaction();
    }

    public void commitTransaction() {
        System.out.println("提交事务");
    }

    public void beginTransaction() {
        System.out.println("开启事务");
    }



}
