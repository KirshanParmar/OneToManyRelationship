package com.microservice.lms.user.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "user_role", schema = "library_management_system", catalog = "")
public class UserRoleEntity {
    private int id;
    private String role;
    private String status;
    private List<UserDetailsEntity> userDetailsById;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "role")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserRoleEntity that = (UserRoleEntity) o;
        return id == that.id && Objects.equals(role, that.role) && Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, role, status);
    }

    @OneToMany(mappedBy = "departmentByDepartmentId", cascade = CascadeType.ALL)
    public List<UserDetailsEntity> getUserDetailsById() {

        return userDetailsById;
    }

    public void setUserDetailsById(List<UserDetailsEntity> userDetailsById) {

        this.userDetailsById = userDetailsById;
    }

}
