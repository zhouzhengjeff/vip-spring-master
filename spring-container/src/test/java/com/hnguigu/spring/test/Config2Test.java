package com.hnguigu.spring.test;

import com.hnguigu.spring.entity.Department;
import com.hnguigu.spring.entity.Role;
import com.hnguigu.spring.entity.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.net.URL;
import java.net.URLDecoder;

public class Config2Test {

    private XmlBeanFactory xmlBeanFactory;
    private Role role;
    private User user;
    private Department department;

    @Before
    public void setUp() {
        URL url = Config2Test.class.getClassLoader().getResource("applicationContext.xml");
        String path = url.getPath();

        // 为什么需要解码？url.getPath()获取的类路径中包含了空格（%20）需要将%20解码成为原始的空格
        path = URLDecoder.decode(path);

        Resource resource = new ClassPathResource(path, Role.class);
        this.xmlBeanFactory = new XmlBeanFactory(resource);
        this.role = (Role) this.xmlBeanFactory.getBean("role");

    }

    @Test
    public void test1() {
        System.out.println(this.role);
    }
}
