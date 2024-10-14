package com.hnguigu.spring.test;

import com.hnguigu.spring.entity.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IocTest {

    private ApplicationContext context;
    private User user;

    @Before
    public void setUp() {
        // 创建了Spring IoC容器。虽然可行，但是真正开发中绝对不用（没有扩展性）
//        this.context = new FileSystemXmlApplicationContext
//        ("E:\\Workspace\\2305JA\\code\\vip-spring-master\\spring-container\\src\\main\\resources
//        \\applicationContext.xml");

        // 有扩展性，但是麻烦了（必须写上classpath:）
        this.context = new FileSystemXmlApplicationContext("classpath:/applicationContext.xml");

        // 获取User类型的Bean。此处是根据beanName获取Bean
        this.user = (User) this.context.getBean("user");
    }

    @Test
    public void test1() {
        System.out.println(this.user);
    }
}
