package com.hnguigu.spring.service;


import com.hnguigu.spring.entity.User;

public interface UserService {

    void addUser(User user);

    void deleteUser(User user);

    void modifyUser(User user);

    User findUserById(Long id);
}
