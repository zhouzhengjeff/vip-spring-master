package com.hnguigu.spring.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Demo1 implements Serializable {

    private static final long serialVersionUID = 6826271773255226785L;
    private Long id;
    private String name;
    private Integer age;


}
