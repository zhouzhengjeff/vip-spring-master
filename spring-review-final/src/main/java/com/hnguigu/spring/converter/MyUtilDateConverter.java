package com.hnguigu.spring.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyUtilDateConverter implements Converter<String, Date> {

    private String pattern;

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public Date convert(String source) {
        Date date = null;

        if (StringUtils.isEmpty(source)) {
            throw new IllegalArgumentException("source is null");
        }

        try {
            date = new SimpleDateFormat(this.pattern).parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return date;
    }
}
