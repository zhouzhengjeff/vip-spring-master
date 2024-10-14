package com.hngugiu.spring.service.impl;

import com.hngugiu.spring.dao.UserDao;
import com.hngugiu.spring.entity.User;
import com.hngugiu.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

// 默认的beanName是“userServiceImpl”。UserServiceImpl这个类的简单名称，但是讲首字母小写
//@Service

// beanName就是我指定的名称（别名）  userService
@Service("userService")


//@Component(value = "userService")
public class UserServiceImpl implements UserService {

    /**
     * 按照类型匹配，找到了两个，此时会再用名称匹配，但是名称匹配没有找到一个（userDaoJdbcImpl和userDaoMyBatisImpl）。
     */
    // @Autowired

    // 按照名称匹配，没有找到，此时再按照类型匹配找到了两个，因此报错
    // @Resource

    // 只用名称匹配 就只找userDaoJdbcImpl这个bean
    //    @Resource(name = "userDaoJdbcImpl")



    // 这两个注解搭配使用，意味着就按照名称匹配
    @Autowired
    @Qualifier("userDaoMyBatisImpl")
    private UserDao userDao;

    @Override
    public void addUser(User user) {
        if (ObjectUtils.isEmpty(user)) {
            throw new IllegalArgumentException("user is null");
        }

        this.userDao.save(user);
    }
}
