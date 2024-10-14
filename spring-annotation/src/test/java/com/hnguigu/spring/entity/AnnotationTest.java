package com.hnguigu.spring.entity;

import com.hngugiu.spring.entity.Department;
import com.hngugiu.spring.entity.User;
import com.hngugiu.spring.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {

    private ApplicationContext context;
    private UserService userService;

    @Before
    public void setUp() throws Exception {
        this.context = new ClassPathXmlApplicationContext("applicationContext.xml");
        this.userService = (UserService) this.context.getBean("userService");
    }

    @Test
    public void test1() {
        // 链式编程
        User user = User.builder().id(1000).name("zhangsan").build();
        this.userService.addUser(user);

    }

    @Test
    public void test2() {

        // 获取所有的beanName的数组
        // BeanDefinition（Bean定义）----> Bean
        String[] beanDefinitionNames = this.context.getBeanDefinitionNames();

        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

        Department department = (Department) this.context.getBean("department");
        System.out.println(department);

    }
}