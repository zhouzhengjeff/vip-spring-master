package com.hnguigu.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee implements Serializable {

    private static final long serialVersionUID = -9019909302772839904L;
    private Long id;
    private String name;
    private Date birthday;


}
