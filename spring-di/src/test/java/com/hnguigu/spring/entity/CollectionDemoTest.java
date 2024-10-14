package com.hnguigu.spring.entity;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

public class CollectionDemoTest {

    private ApplicationContext context;
    private CollectionDemo collectionDemo;

    @Before
    public void setUp() throws Exception {
        this.context = new ClassPathXmlApplicationContext("applicationContext.xml");
        this.collectionDemo = (CollectionDemo) this.context.getBean("collectionDemo");
    }

    @Test
    public void test1() {
        String[] arrayValues = this.collectionDemo.getArrayValues();
        List<String> listValues = this.collectionDemo.getListValues();
        Set<String> setValues = this.collectionDemo.getSetValues();
        Map<String, String> mapValues = this.collectionDemo.getMapValues();
        Properties properties = this.collectionDemo.getProperties();

        Arrays.stream(arrayValues).forEach(System.out::println);
        System.out.println();

        listValues.forEach(System.out::println);
        System.out.println();

        setValues.forEach(System.out::println);
        System.out.println();

        mapValues.forEach((k, v) -> System.out.println(k + ":" + v));
        System.out.println();

        properties.forEach((k, v) -> System.out.println(k + ":" + v));
    }
}