package com.hnguigu.spring.entity;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Appinfo;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class UserTest {

    private ApplicationContext context;

    private User user;

    @Before
    public void setUp() throws Exception {
        // 默认情况下创建IoC容器后，立刻创建Bean(调用无参构造方法)
        this.context = new ClassPathXmlApplicationContext("applicationContext.xml");
        this.user = (User) this.context.getBean("user");
    }

    @Test
    public void testBean1() {
        System.out.println(this.user);
    }
}