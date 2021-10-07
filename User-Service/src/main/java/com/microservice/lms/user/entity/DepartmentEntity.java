package com.microservice.lms.user.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "department", schema = "library_management_system", catalog = "")
public class DepartmentEntity {
    private int id;
    private String departmentName;
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
    @Column(name = "departmentName")
    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DepartmentEntity that = (DepartmentEntity) o;
        return id == that.id && Objects.equals(departmentName, that.departmentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, departmentName);
    }

    @OneToMany(mappedBy = "departmentByDepartmentId", cascade = CascadeType.ALL)
    public List<UserDetailsEntity> getUserDetailsById() {

        return userDetailsById;
    }

    public void setUserDetailsById(List<UserDetailsEntity> userDetailsById) {

        this.userDetailsById = userDetailsById;
    }
}
