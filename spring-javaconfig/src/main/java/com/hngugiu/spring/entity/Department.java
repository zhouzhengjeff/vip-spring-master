package com.hngugiu.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Data

@ToString
//@Component
public class Department implements Serializable {


    private static final long serialVersionUID = -6952943710480198630L;

    private Integer id;
    private String name;

    public Department() {
        System.out.println("Department()");
    }
}
