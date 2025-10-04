package com.practice.department_service.service;

import com.practice.department_service.entity.Department;
import com.practice.department_service.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    private static final Logger log = LoggerFactory.getLogger(DepartmentService.class);
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        // This method saves the department entity to the database
        log.info("inside saveDepartment of DepartmentService");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        // This method retrieves a department entity by its ID from the database
        log.info("inside findDepartmentById of DepartmentService");
        return departmentRepository.findById(departmentId)
                .orElseThrow(() -> new RuntimeException("Department not found with id: " + departmentId));
    }
}
