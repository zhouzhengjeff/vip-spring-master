package com.hngugiu.spring.dao.impl;

import com.hngugiu.spring.dao.UserDao;
import com.hngugiu.spring.entity.User;
import org.springframework.stereotype.Repository;

@Repository(value = "userDao")
//@Component
public class UserDaoJdbcImpl implements UserDao {

    @Override
    public void save(User user) {
        System.out.println("JDBC添加用户：" + user);
    }
}
