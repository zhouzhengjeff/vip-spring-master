package com.hnguigu.spring.service.impl;


import com.hnguigu.spring.dao.UserDao;
import com.hnguigu.spring.entity.Log;
import com.hnguigu.spring.entity.User;
import com.hnguigu.spring.service.LogService;
import com.hnguigu.spring.service.UserService;
import org.apache.commons.lang3.ObjectUtils;

import java.util.Date;
import java.util.List;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    private LogService logService;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setLogService(LogService logService) {
        this.logService = logService;
    }

    @Override
    public void addUser(User user) {
        if (ObjectUtils.isEmpty(user)) {
            throw new IllegalArgumentException("user is null");
        }

        this.userDao.save(user);

        // TODO 实例化日志
        Log log = new Log();
        log.setContent("测试日志");
        log.setCreateTime(new Date());

        // TODO 添加日志
        this.logService.addLog(log);
    }

    @Override
    public void deleteUser(User user) {
        if (ObjectUtils.isEmpty(user)) {
            throw new IllegalArgumentException("user is null");
        }

        this.userDao.delete(user);
    }

    @Override
    public void modifyUser(User user) {
        if (ObjectUtils.isEmpty(user)) {
            throw new IllegalArgumentException("user is null");
        }
        this.userDao.update(user);
    }

    @Override
    public User findUserById(Long id) {
        if (ObjectUtils.isEmpty(id)) {
            throw new IllegalArgumentException("id is null");
        }

        return this.userDao.findById(id);

    }

    @Override
    public List<User> findAllUsers() {
        return this.userDao.findAll();
    }

}
