package com.hnguigu.spring.test;

import com.hnguigu.spring.entity.Department;
import com.hnguigu.spring.entity.Role;
import com.hnguigu.spring.entity.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Config1Test {

    private ApplicationContext context;
    private Role role;
    private User user;
    private Department department;

    @Before
    public void setUp() {
        // 通配符已经不支持，会抛出异常
        // this.context = new ClassPathXmlApplicationContext("applicationContext-*.xml");

        this.context = new ClassPathXmlApplicationContext("applicationContext.xml");
        this.role = (Role) this.context.getBean("role");
        this.user = (User) this.context.getBean("user");
        this.department = (Department) this.context.getBean("department");
    }

    @Test
    public void test1() {
        System.out.println(this.role);
        System.out.println(this.user);
        System.out.println(this.department);
    }
}
