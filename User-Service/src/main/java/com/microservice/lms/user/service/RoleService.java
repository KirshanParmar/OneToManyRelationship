package com.microservice.lms.user.service;

import com.microservice.lms.user.entity.UserRoleEntity;

public interface RoleService {
    public UserRoleEntity saveRole(UserRoleEntity role);
    public UserRoleEntity getRoleById(Integer id);
}
