package com.practice.department_service.repository;

import com.practice.department_service.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    // This interface will automatically provide the necessary methods for CRUD operations
    // on the Department entity, such as save, findById, findAll, deleteById, etc.
}
