package com.hnguigu.spring.service.impl;


import com.hnguigu.spring.dao.UserDao;
import com.hnguigu.spring.dao.impl.UserDaoImpl;
import com.hnguigu.spring.entity.User;
import com.hnguigu.spring.handler.TransactionHandler;
import com.hnguigu.spring.service.UserService;
import org.apache.commons.lang3.ObjectUtils;


public class UserServiceImplByStaticProxy implements UserService {

    private UserDao userDao = new UserDaoImpl();

    private TransactionHandler transactionHandler = new TransactionHandler();

    @Override
    public void addUser(User user) {
        if (ObjectUtils.isEmpty(user)) {
            throw new IllegalArgumentException("user is null");
        }

        transactionHandler.beginTransaction();

        this.userDao.save(user);

        transactionHandler.commitTransaction();
    }

    @Override
    public void deleteUser(User user) {
        if (ObjectUtils.isEmpty(user)) {
            throw new IllegalArgumentException("user is null");
        }

        transactionHandler.beginTransaction();

        this.userDao.delete(user);

        transactionHandler.commitTransaction();
    }

    @Override
    public void modifyUser(User user) {
        if (ObjectUtils.isEmpty(user)) {
            throw new IllegalArgumentException("user is null");
        }

        transactionHandler.beginTransaction();

        this.userDao.update(user);

        transactionHandler.commitTransaction();
    }


}
