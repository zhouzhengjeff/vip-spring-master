package com.hnguigu.spring;

public class ADemo {

    private BDemo bDemo;

    public ADemo() {
    }

    public ADemo(BDemo bDemo) {
        this.bDemo = bDemo;
    }

    public void setbDemo(BDemo bDemo) {
        this.bDemo = bDemo;
    }

    public void fun() {
        this.bDemo.service();
    }
}


