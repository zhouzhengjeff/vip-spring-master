package com.hnguigu.spring.service.impl;

import com.hnguigu.spring.dao.LogDao;
import com.hnguigu.spring.entity.Log;
import com.hnguigu.spring.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("LogService")
@Transactional
public class LogServiceImpl implements LogService {


    @Autowired
    private LogDao logDao;

    @Override
    public void addLog(Log log) {
        // 抛异常
        int i = 10 / 0;
        this.logDao.save(log);
    }
}
