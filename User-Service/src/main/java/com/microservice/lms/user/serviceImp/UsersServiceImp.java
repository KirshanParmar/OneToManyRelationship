package com.microservice.lms.user.serviceImp;

import com.microservice.lms.user.dto.ResponseRequest;
import com.microservice.lms.user.entity.DepartmentEntity;
import com.microservice.lms.user.entity.UserDetailsEntity;
import com.microservice.lms.user.entity.UserRoleEntity;
import com.microservice.lms.user.repository.DepartmentRepository;
import com.microservice.lms.user.repository.UsersRepository;
import com.microservice.lms.user.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImp implements UsersService {

    @Autowired
    private UsersRepository userDetailsRepository;
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public UserDetailsEntity saveUser(UserDetailsEntity users) {

        return userDetailsRepository.save(users);
    }

    @Override
    public UserDetailsEntity getUserById(Integer id) {

        return userDetailsRepository.getById(id);
    }


    @Override
    public UserDetailsEntity saveUsers(ResponseRequest responseRequest) {

        DepartmentEntity departmentEntity = new DepartmentEntity();
        departmentEntity.setDepartmentName(responseRequest.getDepartmentEntity().getDepartmentName());

        UserRoleEntity userRoleEntity = new UserRoleEntity();
        userRoleEntity.setRole(responseRequest.getUserRoleEntity().getRole());
        userRoleEntity.setStatus(responseRequest.getUserRoleEntity().getStatus());

        UserDetailsEntity user=new UserDetailsEntity();
        user.setName(responseRequest.getName());
        user.setEmail(responseRequest.getEmail());
        user.setDepartmentByDepartmentId(departmentEntity);
        user.setUserRoleByUserRoleId(userRoleEntity);
//        user.getDepartmentByDepartmentId().setId(responseRequest.getDepartment_id());
        return userDetailsRepository.save(user);

    }


    @Override
    public UserDetailsEntity updateUsers(ResponseRequest responseRequest) {

        UserDetailsEntity userDetailsEntity = userDetailsRepository.getById(responseRequest.getId());
        userDetailsEntity.setId(responseRequest.getId());
        userDetailsEntity.setEmail(responseRequest.getEmail());
        userDetailsEntity.setName(responseRequest.getName());

        userDetailsEntity.setDepartmentByDepartmentId(new DepartmentEntity());
        userDetailsEntity.getDepartmentByDepartmentId().setId(responseRequest.getDepartmentEntity().getId());

        userDetailsEntity.setUserRoleByUserRoleId(new UserRoleEntity());
        userDetailsEntity.getUserRoleByUserRoleId().setId(responseRequest.getUserRoleEntity().getId());

        return userDetailsRepository.save(userDetailsEntity);

    }
}
