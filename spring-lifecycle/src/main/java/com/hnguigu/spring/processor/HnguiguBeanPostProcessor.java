package com.hnguigu.spring.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

public class HnguiguBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("HnguiguBeanPostProcessor.postProcessBeforeInitialization()");
        System.out.println("当前的Bean为：" + bean.getClass().getName());
        System.out.println("当前的Bean的名字为：" + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("HnguiguBeanPostProcessor.postProcessAfterInitialization()");
        System.out.println("当前的Bean为：" + bean.getClass().getName());
        System.out.println("当前的Bean的名字为：" + beanName);
        return bean;
    }

}
