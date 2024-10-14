package com.hnguigu.spring.service;


import com.hnguigu.spring.entity.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    void deleteUser(User user);

    void modifyUser(User user);

    User findUserById(Long id);

    List<User> findAllUsers();
}
