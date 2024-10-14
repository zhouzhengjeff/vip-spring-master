package com.hnguigu.spring.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class Department implements Serializable {

    private static final long serialVersionUID = -1124768932124856258L;
    private Long id;
    private String name;
}
