package com.hngugiu.spring.dao.impl;

import com.hngugiu.spring.dao.UserDao;
import com.hngugiu.spring.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Repository
//@Component
public class UserDaoImpl implements UserDao {

    @Override
    public void save(User user) {
        System.out.println("添加用户：" + user);

    }
}
