package com.hnguigu.spring.factory;

import com.hnguigu.spring.entity.Department;

public class DepartmentFactory {

    private static Department department = new Department();

    public Department createDepartment() {
        this.department.setId(21);
        this.department.setName("IBM");
        return this.department;
    }
}
