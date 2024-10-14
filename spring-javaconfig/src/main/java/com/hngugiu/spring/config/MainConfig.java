package com.hngugiu.spring.config;

import com.hngugiu.spring.entity.Department;
import org.springframework.context.annotation.*;

/**
 * 主配置类 相当于 applicationContext.xml。必须要加一个注解@Configuration
 * 加了这个@Configuraration注解就相当于这个类是配置文件
 */
@Configuration
@ComponentScan(basePackages = "com.hngugiu.spring")
public class MainConfig {

    /**
     * @Bean放在了方法上，意味着该方法的返回值类型的对象纳入SpringIoC容器
     * @return
     */
    @Bean
    // 默认是true,Bean的创建延迟
    @Lazy
    @Scope(value = "prototype")
    public Department department() {
        Department department = new Department();
        department.setId(1);
        department.setName("IBM");
        return department;
    }
}
