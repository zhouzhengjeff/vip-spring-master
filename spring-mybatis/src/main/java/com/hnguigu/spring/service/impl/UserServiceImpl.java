package com.hnguigu.spring.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hnguigu.spring.entity.User;
import com.hnguigu.spring.mapper.UserMapper;
import com.hnguigu.spring.service.UserService;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public PageInfo<User> findPagination(Integer pageNo, Integer pageSize) {
        PageInfo<User> pageInfo = null;

        if (ObjectUtils.isEmpty(pageNo) || ObjectUtils.isEmpty(pageSize)) {
            throw new IllegalArgumentException("");
        }

        PageHelper.startPage(pageNo, pageSize);

        List<User> userList = this.userMapper.findAll();
        if (!CollectionUtils.isEmpty(userList)) {
            pageInfo = new PageInfo<>(userList);
            pageInfo.setPageNum(pageNo);
            pageInfo.setPageSize(pageSize);
        }

        return pageInfo;
    }
}
