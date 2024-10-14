package com.hnguigu.spring.entity;

import com.hngugiu.spring.config.MainConfig;
import com.hngugiu.spring.entity.Department;
import com.hngugiu.spring.entity.User;
import com.hngugiu.spring.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationTest {

    private ApplicationContext context;
    private UserService userService;
    private Department department1;
    private Department department2;

    @Before
    public void setUp() throws Exception {
        this.context = new AnnotationConfigApplicationContext(MainConfig.class);
        this.userService = (UserService) this.context.getBean("userService");
        this.department1 = (Department) this.context.getBean("department");
        this.department2 = (Department) this.context.getBean("department");
    }

    @Test
    public void test1() {
        // 链式编程
        User user = User.builder().id(1000).name("zhangsan").build();
        this.userService.addUser(user);

        System.out.println(this.department1 == this.department2);

    }

    @Test
    public void test2() {
        /*String[] beanDefinitionNames = this.context.getBeanDefinitionNames();

        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }*/

        System.out.println();

        Department department = (Department) this.context.getBean("department");
        System.out.println(department);

    }
}