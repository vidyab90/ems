package com.exampleSpringBoot.May2025.ems.repository;

import com.exampleSpringBoot.May2025.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployessRepository extends JpaRepository<Employee,Long> {
}
