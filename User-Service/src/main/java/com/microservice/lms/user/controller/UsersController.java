package com.microservice.lms.user.controller;

import com.microservice.lms.user.dto.ResponseRequest;
import com.microservice.lms.user.entity.UserDetailsEntity;
import com.microservice.lms.user.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UsersController{

    @Autowired
    private UsersService userDetailsService;

    @PostMapping("/save")
    public UserDetailsEntity saveUserDetails(@RequestBody UserDetailsEntity users){
        return userDetailsService.saveUser(users);
    }

    @GetMapping("/{id}")
    public UserDetailsEntity getByIdUserDetails(@PathVariable("id") Integer id){

        return userDetailsService.getUserById(id);
    }
    @PostMapping("/add")
    public UserDetailsEntity saveUserDetail(@RequestBody ResponseRequest responseRequest){

        return userDetailsService.saveUsers(responseRequest);
    }
    @PutMapping("/update")
    public UserDetailsEntity updateUserDetail(@RequestBody ResponseRequest responseRequest){

        return userDetailsService.updateUsers(responseRequest);
    }


}
