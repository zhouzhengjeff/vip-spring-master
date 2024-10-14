package com.hnguigu.spring.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class User implements Serializable {

    private static final long serialVersionUID = 682816547646407187L;
    private Integer id;
    private String name;

    public User() {
        System.out.println("User()");
    }

}
