package com.hnguigu.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
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

    public static User createUser() {
        User user = new User();
        user.setId(1);
        user.setName("lisi");
        return user;
    }
}
