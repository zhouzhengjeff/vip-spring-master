package com.hnguigu.spring.test;

import com.hnguigu.spring.entity.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactoryTest {

    private BeanFactory factory;
    private User user;

    @Before
    public void setUp() {
        // 创建了Spring IoC容器
        this.factory = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 获取User类型的Bean。此处是根据beanName获取Bean
        this.user = (User) this.factory.getBean("user");
    }

    @Test
    public void test1() {
        System.out.println(this.user);
    }
}
