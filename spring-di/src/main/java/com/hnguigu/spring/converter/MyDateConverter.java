package com.hnguigu.spring.converter;

import org.apache.commons.lang3.time.DateUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

import java.util.Date;

public class MyDateConverter implements Converter<String, Date> {

    private String[] patterns;

    public void setPatterns(String[] patterns) {
        this.patterns = patterns;
    }

    @Override
    public Date convert(String source) {
        Date date = null;

        if (StringUtils.isEmpty(source)) {
            throw new IllegalArgumentException("");
        }

        try {
            date = DateUtils.parseDate(source, this.patterns);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return date;
    }
}
