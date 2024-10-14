package com.hnguigu.spring.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Data
public class CollectionDemo implements Serializable {

    private static final long serialVersionUID = -7367215572668510322L;

    private String[] arrayValues;

    private List<String> listValues;

    private Set<String> setValues;

    private Map<String, String> mapValues;

    private Properties properties;
}
