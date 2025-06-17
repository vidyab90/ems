package com.exampleSpringBoot.May2025.ems.util;

import com.exampleSpringBoot.May2025.ems.dto.EmployeeDTO;
import com.exampleSpringBoot.May2025.ems.entity.Employee;

public class EntityConverter {

    public static EmployeeDTO employeeConverterToDTO(Employee employee) {
        return EmployeeDTO.builder()
                .id(employee.getId())
                .firstName(employee.getFirstName())
                .lastName(employee.getLastName())
                .email(employee.getEmail())
                .build();
    }

    public static Employee employeeConverterToEntity(EmployeeDTO employee) {
        return Employee.builder()
                .id(employee.getId())
                .firstName(employee.getFirstName())
                .lastName(employee.getLastName())
                .email(employee.getEmail())
                .build();
    }
}
