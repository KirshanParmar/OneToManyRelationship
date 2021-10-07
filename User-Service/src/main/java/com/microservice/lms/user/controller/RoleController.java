package com.microservice.lms.user.controller;

import com.microservice.lms.user.entity.UserRoleEntity;
import com.microservice.lms.user.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleService  roleService;

    @PostMapping("/save")
    public UserRoleEntity saveRole(@RequestBody UserRoleEntity role){

        return roleService.saveRole(role);
    }
    @GetMapping("/{id}")
    public UserRoleEntity getRoleById(@PathVariable("id") Integer id){
        return roleService.getRoleById(id);
    }

}
