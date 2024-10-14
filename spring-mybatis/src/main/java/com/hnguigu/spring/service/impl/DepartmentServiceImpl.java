package com.hnguigu.spring.service.impl;

import com.hnguigu.spring.entity.Department;
import com.hnguigu.spring.mapper.DepartmentMapper;
import com.hnguigu.spring.service.DepartmentService;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("departmentService")
@Transactional
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public void addDepartment(Department department) {
        if (ObjectUtils.isEmpty(department)) {
            return;
        }

        this.departmentMapper.save(department);
    }
}
