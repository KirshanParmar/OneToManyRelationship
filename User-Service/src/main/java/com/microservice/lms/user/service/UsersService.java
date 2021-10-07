package com.microservice.lms.user.service;
import com.microservice.lms.user.dto.ResponseRequest;
import com.microservice.lms.user.entity.UserDetailsEntity;

public interface UsersService {

    public UserDetailsEntity saveUser(UserDetailsEntity users);
    public UserDetailsEntity getUserById(Integer id);
    public UserDetailsEntity saveUsers(ResponseRequest responseRequest);
    public UserDetailsEntity updateUsers(ResponseRequest responseRequest);
}
