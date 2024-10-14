package com.hnguigu.spring;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LazyTest {

    private ApplicationContext context;
    private User user;

    @Before
    public void setUp() throws Exception {
        this.context = new ClassPathXmlApplicationContext("applicationContext.xml");
        this.user = (User) this.context.getBean("user");
    }

    @Test
    public void fun() {
        System.out.println(this.user);
    }
}