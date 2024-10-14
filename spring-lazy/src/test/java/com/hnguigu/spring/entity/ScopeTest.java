package com.hnguigu.spring.entity;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {

    private ApplicationContext context;

    private Department department1;
    private Department department2;

    private Role role1;
    private Role role2;

    @Before
    public void setUp() throws Exception {
        // 默认情况下创建IoC容器后，立刻创建Bean(调用无参构造方法)
        this.context = new ClassPathXmlApplicationContext("applicationContext.xml");
        this.department1 = (Department) this.context.getBean("department");
        this.department2 = (Department) this.context.getBean("department");

        this.role1 = (Role) this.context.getBean("role");
        this.role2 = (Role) this.context.getBean("role");
    }

    @Test
    public void testBean1() {
        // true 默认是单例Bean
        // == 判断引用（地址）
        System.out.println(this.department1 == this.department2);
    }

    @Test
    public void testScope() {
        System.out.println(this.role1 == this.role2);// true
    }
}