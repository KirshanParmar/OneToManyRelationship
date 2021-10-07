package com.microservice.lms.user.serviceImp;

import com.microservice.lms.user.entity.UserRoleEntity;
import com.microservice.lms.user.repository.RoleRepository;
import com.microservice.lms.user.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImp implements RoleService {
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public UserRoleEntity saveRole(UserRoleEntity role) {
        return roleRepository.save(role);
    }

    @Override
    public UserRoleEntity getRoleById(Integer id) {
        return roleRepository.getById(id);
    }
}
