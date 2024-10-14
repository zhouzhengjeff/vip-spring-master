package com.hnguigu.spring.service.impl;


import com.hnguigu.spring.dao.UserDao;
import com.hnguigu.spring.entity.Log;
import com.hnguigu.spring.entity.User;
import com.hnguigu.spring.service.LogService;
import com.hnguigu.spring.service.UserService;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service("userService")

// 使用了声明式事务
// 该注解如果放在类上，意味着这个类的所有的方法都使用该注解中的相关配置（注解上有一些属性（propagation，isolation，readOnly,,,,））
// 该注解也可以放在方法上，只是针对该方法进行了事务的相关配置
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private LogService logService;

    @Override
//    @Transactional(propagation = Propagation.REQUIRES_NEW)
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
