package com.microservice.lms.user.controller;
import com.microservice.lms.user.entity.DepartmentEntity;
import com.microservice.lms.user.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/save")
    public DepartmentEntity saveDepartment(@RequestBody DepartmentEntity department){
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public DepartmentEntity getByDepartmentId(@PathVariable("id") Integer id){
        return departmentService.getDepartmentById(id);
    }
}
