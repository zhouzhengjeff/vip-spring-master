package com.hnguigu.spring.entity;

import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class User implements Serializable {


    private static final long serialVersionUID = -519167387102259623L;
    private Long id;
    private String name;
}
