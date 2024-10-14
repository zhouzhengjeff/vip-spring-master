package com.hnguigu.spring.service.impl;

import com.hnguigu.spring.dao.LogDao;
import com.hnguigu.spring.entity.Log;
import com.hnguigu.spring.service.LogService;

public class LogServiceImpl implements LogService {

    private LogDao logDao;

    public void setLogDao(LogDao logDao) {
        this.logDao = logDao;
    }

    @Override
    public void addLog(Log log) {
        // 抛异常
        int i = 10 / 0;
        this.logDao.save(log);
    }
}
