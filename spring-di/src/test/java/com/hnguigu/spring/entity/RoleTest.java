package com.hnguigu.spring.entity;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RoleTest {

    private ApplicationContext context;
    private Role role;

    @Before
    public void setUp() throws Exception {
        this.context = new ClassPathXmlApplicationContext("applicationContext.xml");
        this.role = (Role) this.context.getBean("role");
    }

    @Test
    public void test1() {
        System.out.println(this.role);
    }
}