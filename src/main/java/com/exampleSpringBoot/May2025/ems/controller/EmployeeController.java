package com.exampleSpringBoot.May2025.ems.controller;

import com.exampleSpringBoot.May2025.ems.dto.EmployeeDTO;
import com.exampleSpringBoot.May2025.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/create")
    public ResponseEntity<EmployeeDTO> createEmployee(@RequestBody EmployeeDTO employee) {
        return ResponseEntity.ok(employeeService.createEmployee(employee));
    }

    @GetMapping("/get")
    public ResponseEntity<List<EmployeeDTO>> getAllEmployee() {
        return ResponseEntity.ok(employeeService.getAllEmployee());
    }
    @PutMapping("/update")
    public ResponseEntity<Optional<EmployeeDTO>> updateEmployee(@RequestBody EmployeeDTO employeeDTO)
    {
        return ResponseEntity.ok(employeeService.updateEmployee(employeeDTO));
    }
    @DeleteMapping("/delete")
    public String deleteEmployee(@RequestBody Long emloyeeId)
    {
        return employeeService.deleteEmployee(emloyeeId);
    }
}
