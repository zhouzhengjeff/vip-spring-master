package com.hnguigu.spring.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class Role implements Serializable {


    private static final long serialVersionUID = -6246126978360309481L;
    private Integer id;
    private String name;

    public Role() {
        System.out.println("Role()");
    }
}
