package com.hnguigu.spring.dao.impl;


import com.hnguigu.spring.dao.UserDao;
import com.hnguigu.spring.entity.User;

public class UserDaoImpl implements UserDao {

    @Override
    public void save(User user) {
        System.out.println("添加用户：" + user);
    }

    @Override
    public void delete(User user) {
        System.out.println("删除用户，" + user);
    }

    @Override
    public void update(User user) {
        System.out.println("更新用户，" + user);
    }

    @Override
    public User findById(Long id) {
        return new User(id, "hnguigu");
    }
}
