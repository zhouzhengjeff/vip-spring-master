package com.hnguigu.spring.service.impl;

import com.hnguigu.spring.entity.Department;
import com.hnguigu.spring.entity.User;
import com.hnguigu.spring.service.DepartmentService;
import com.hnguigu.spring.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

import static org.junit.Assert.*;

public class DepartmentServiceImplTest {

    private ApplicationContext context;
    private DepartmentService departmentService;

    @Before
    public void setUp() throws Exception {
        this.context = new ClassPathXmlApplicationContext("applicationContext.xml");
        this.departmentService = (DepartmentService) context.getBean("departmentService");
    }

    @Test
    public void testAddUser() {
        Department department = new Department();
        department.setName("IBM");
        department.setLocation("Beijing");
        departmentService.addDepartment(department);
    }
}