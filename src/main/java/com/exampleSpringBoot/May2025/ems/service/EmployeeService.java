package com.exampleSpringBoot.May2025.ems.service;

import com.exampleSpringBoot.May2025.ems.dto.EmployeeDTO;
import com.exampleSpringBoot.May2025.ems.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    public List<EmployeeDTO> getAllEmployee();
    public EmployeeDTO createEmployee(EmployeeDTO employee);
    public Optional<EmployeeDTO> updateEmployee(EmployeeDTO employee);
    public String deleteEmployee(Long employeeId);
}
