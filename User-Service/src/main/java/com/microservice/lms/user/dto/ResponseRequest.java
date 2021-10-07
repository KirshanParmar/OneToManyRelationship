package com.microservice.lms.user.dto;

import com.microservice.lms.user.entity.DepartmentEntity;
import com.microservice.lms.user.entity.UserRoleEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseRequest {
    private Integer id;
    private String name;
    private String email;
    private DepartmentEntity departmentEntity;
    private UserRoleEntity userRoleEntity;
}
