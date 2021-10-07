package com.microservice.lms.user.service;

import com.microservice.lms.user.entity.DepartmentEntity;

public interface DepartmentService {
    public DepartmentEntity saveDepartment(DepartmentEntity department);
    public DepartmentEntity getDepartmentById(Integer id);
}
