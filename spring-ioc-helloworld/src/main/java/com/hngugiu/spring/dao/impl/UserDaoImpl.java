package com.hngugiu.spring.dao.impl;

import com.hngugiu.spring.dao.UserDao;
import com.hngugiu.spring.entity.User;

public class UserDaoImpl implements UserDao {

    @Override
    public void save(User user) {
        System.out.println("添加用户：" + user);
    }
}
