package com.hnguigu.spring;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class ADemoTest {

    private ApplicationContext context;
    private ADemo aDemo;

    @Before
    public void setUp() throws Exception {
        this.context = new ClassPathXmlApplicationContext("applicationContext.xml");
        this.aDemo = (ADemo) this.context.getBean("aDemo");
    }

    @Test
    public void fun() {
        this.aDemo.fun();
    }
}