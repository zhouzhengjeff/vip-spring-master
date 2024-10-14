package com.hnguigu.spring.dao;


import com.hnguigu.spring.entity.User;

public interface UserDao {

    void save(User user);

    void delete(User user);

    void update(User user);

    User findById(Long id);
}
