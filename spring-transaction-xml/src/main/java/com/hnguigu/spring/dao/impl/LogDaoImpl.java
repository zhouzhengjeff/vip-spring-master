package com.hnguigu.spring.dao.impl;

import com.hnguigu.spring.dao.LogDao;
import com.hnguigu.spring.entity.Log;
import org.springframework.jdbc.core.JdbcTemplate;

public class LogDaoImpl implements LogDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void save(Log log) {
        String sql = "INSERT INTO SPRING_LOG(LOG_ID, LOG_CONTENT,LOG_CREATE_TIME) VALUES (NULL, ?,?)";

        this.jdbcTemplate.update(sql, new Object[]{log.getContent(), log.getCreateTime()});
    }
}
