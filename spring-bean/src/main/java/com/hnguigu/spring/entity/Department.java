package com.hnguigu.spring.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Department implements Serializable {

    private static final long serialVersionUID = -1124768932124856258L;
    private Integer id;
    private String name;
}
