package com.hnguigu.spring.dao;


import com.hnguigu.spring.entity.User;

import java.util.List;

public interface UserDao {

    void save(User user);

    void delete(User user);

    void update(User user);

    User findById(Long id);

    List<User> findAll();
}
