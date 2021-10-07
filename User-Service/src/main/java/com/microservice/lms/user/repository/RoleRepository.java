package com.microservice.lms.user.repository;

import com.microservice.lms.user.entity.UserRoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<UserRoleEntity, Integer> {
}
