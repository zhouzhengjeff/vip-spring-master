package com.hnguigu.spring.entity;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DepartmentTest {

    private ApplicationContext context;

    private Department department;

    @Before
    public void setUp() throws Exception {
        // 默认情况下创建IoC容器后，立刻创建Bean(调用无参构造方法)
        this.context = new ClassPathXmlApplicationContext("applicationContext.xml");
        this.department = (Department) this.context.getBean("department");
    }

    @Test
    public void testBean1() {
        System.out.println(this.department);
    }
}