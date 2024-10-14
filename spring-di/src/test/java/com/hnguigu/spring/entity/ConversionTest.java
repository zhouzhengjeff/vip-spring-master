package com.hnguigu.spring.entity;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConversionTest {

    private ApplicationContext context;
    private Employee employee;

    @Before
    public void setUp() throws Exception {
        this.context = new ClassPathXmlApplicationContext("applicationContext.xml");
        this.employee = (Employee) this.context.getBean("employee");
    }

    @Test
    public void test1() {
        System.out.println(this.employee);
    }

}
