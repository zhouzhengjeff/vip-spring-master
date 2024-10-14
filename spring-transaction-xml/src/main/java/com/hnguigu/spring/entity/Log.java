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
public class Log implements Serializable {

    private static final long serialVersionUID = 7893277023322831579L;
    private Long id;
    private String content;
    private Date createTime;
}
