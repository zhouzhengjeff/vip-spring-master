package com.hnguigu.spring.entity;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AbstractBeanTest {

    private ApplicationContext context;
    private Demo1 demo1;
    private Demo2 demo2;

    @Before
    public void setUp() throws Exception {
        this.context = new ClassPathXmlApplicationContext("applicationContext.xml");
        this.demo1 = (Demo1) this.context.getBean("demo1");
        this.demo2 = (Demo2) this.context.getBean("demo2");
    }

    @Test
    public void test1() {
        System.out.println(this.demo1);
        System.out.println(this.demo2);
    }

}
