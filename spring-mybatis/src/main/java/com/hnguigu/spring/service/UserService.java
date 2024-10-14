package com.hnguigu.spring.service;

import com.github.pagehelper.PageInfo;
import com.hnguigu.spring.entity.User;

public interface UserService {

    PageInfo<User> findPagination(Integer pageNo, Integer pageSize);
}
