package com.practice.department_service.controller;

import com.practice.department_service.entity.Department;
import com.practice.department_service.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/documents")
@Slf4j
public class DocumentController {

    private static final Logger log = LoggerFactory.getLogger(DocumentController.class);
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody  Department department) {
        log.info("Inside saveDepartment of DocumentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId) {
        log.info("Inside findDepartmentById of DocumentController");
        return departmentService.findDepartmentById(departmentId);
    }

}
