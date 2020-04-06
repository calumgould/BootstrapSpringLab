package com.codeclan.example.BootstrapSpringLab.repositories;

import com.codeclan.example.BootstrapSpringLab.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
