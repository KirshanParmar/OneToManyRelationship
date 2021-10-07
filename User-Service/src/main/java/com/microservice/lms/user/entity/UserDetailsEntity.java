package com.microservice.lms.user.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user_details", schema = "library_management_system", catalog = "")
public class UserDetailsEntity {
    private int id;
    private String email;
    private String name;
    private UserRoleEntity userRoleByUserRoleId;
    private DepartmentEntity departmentByDepartmentId;

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
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDetailsEntity that = (UserDetailsEntity) o;
        return id == that.id  && Objects.equals(email, that.email) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, email, name);
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    public UserRoleEntity getUserRoleByUserRoleId() {

        return userRoleByUserRoleId;
    }
    public void setUserRoleByUserRoleId(UserRoleEntity userRoleByUserRoleId) {

        this.userRoleByUserRoleId = userRoleByUserRoleId;
    }


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id", referencedColumnName = "id")
    public DepartmentEntity getDepartmentByDepartmentId() {

        return departmentByDepartmentId;
    }
    public void setDepartmentByDepartmentId(DepartmentEntity departmentByDepartmentId) {
        this.departmentByDepartmentId = departmentByDepartmentId;
    }
}
