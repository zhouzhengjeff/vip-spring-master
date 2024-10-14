package com.hnguigu.spring;

import java.util.Date;

public class User {

    private Date birthday;

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public User() {
        System.out.println("User()");
    }
}
