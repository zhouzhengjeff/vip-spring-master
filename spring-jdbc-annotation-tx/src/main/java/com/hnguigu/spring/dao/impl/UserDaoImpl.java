package com.hnguigu.spring.dao.impl;


import com.hnguigu.spring.dao.UserDao;
import com.hnguigu.spring.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void save(User user) {
        String sql =
                "INSERT INTO SPRING_USER(USER_ID, USER_NAME, USER_PASSWORD, USER_SALARY, USER_BIRTHDAY) VALUES " +
                        "(NULL, ?, ?, ?, ?)";
        this.jdbcTemplate.update(sql, new Object[]{user.getName(), user.getPassword(), user.getSalary(),
                user.getBirthday()});
    }

    @Override
    public void delete(User user) {
        String sql = "DELETE FROM SPRING_USER WHERE USER_ID = ?";
        this.jdbcTemplate.update(sql, new Object[]{user.getId()});
    }

    @Override
    public void update(User user) {
        String sql =
                "UPDATE SPRING_USER SET USER_NAME = ?, USER_PASSWORD = ?, USER_SALARY = ?, USER_BIRTHDAY = ? " +
                        "WHERE USER_ID = ?";
        this.jdbcTemplate.update(sql, new Object[]{user.getName(), user.getPassword(), user.getSalary(),
                user.getBirthday(), user.getId()});
    }

    @Override
    public User findById(Long id) {
        String sql =
                "SELECT USER_ID, USER_NAME, USER_PASSWORD, USER_SALARY, USER_BIRTHDAY FROM SPRING_USER WHERE " +
                        "USER_ID = ?";
        return this.jdbcTemplate.queryForObject(sql, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                return rowMap(rs);
            }
        }, new Object[]{id});
    }

    private static User rowMap(ResultSet rs) throws SQLException {
        User user = new User();
        user.setId(rs.getLong("user_id"));
        user.setName(rs.getString("user_name"));
        user.setPassword(rs.getString("user_password"));
        user.setSalary(rs.getFloat("user_salary"));
        user.setBirthday(rs.getDate("user_birthday"));
        return user;
    }

    @Override
    public List<User> findAll() {
        String sql = "SELECT USER_ID, USER_NAME, USER_PASSWORD, USER_SALARY, USER_BIRTHDAY FROM SPRING_USER";
        return this.jdbcTemplate.query(sql, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                return rowMap(rs);
            }
        });
    }
}
