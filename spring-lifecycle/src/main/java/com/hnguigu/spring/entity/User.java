package com.hnguigu.spring.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.Serializable;

@Data
@ToString
public class User implements InitializingBean, DisposableBean, Serializable {

    private static final long serialVersionUID = 682816547646407187L;
    private Integer id;
    private String name;

    public User() {
        System.out.println("User()");
    }

    public void init() {
        System.out.println("init()");
    }

    public void destroy1() {
        System.out.println("destroy1()");
    }

    /**
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet()");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy()");
    }

    @PostConstruct
    public void setUp() {
        System.out.println("setUp()");
    }

    @PreDestroy
    public void destroy2() {
        System.out.println("destroy2()");
    }


}
