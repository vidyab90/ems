package com.exampleSpringBoot.May2025.ems.service;

import com.exampleSpringBoot.May2025.ems.dto.EmployeeDTO;
import com.exampleSpringBoot.May2025.ems.repository.EmployessRepository;
import com.exampleSpringBoot.May2025.ems.util.EntityConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static com.exampleSpringBoot.May2025.ems.util.EntityConverter.employeeConverterToDTO;
import static com.exampleSpringBoot.May2025.ems.util.EntityConverter.employeeConverterToEntity;

@Service
public class EmployeeServiceImplementation implements EmployeeService {

    @Autowired
    EmployessRepository employessRepository;

    @Transactional
    @Override
    public List<EmployeeDTO> getAllEmployee() {
        return employessRepository
                .findAll()
                .stream()
                .map(EntityConverter::employeeConverterToDTO)
                .toList()
                ;
    }

    @Transactional
    @Override
    public EmployeeDTO createEmployee(EmployeeDTO employee) {
        return employeeConverterToDTO(employessRepository.save(employeeConverterToEntity(employee)))

                ;
    }

    @Transactional
    @Override
    public Optional<EmployeeDTO> updateEmployee(EmployeeDTO employee) {
        if (employessRepository.existsById(employee.getId())) {
            return Optional.of(employeeConverterToDTO(employessRepository.save(employeeConverterToEntity(employee))));
        } else {
            return Optional.empty();
        }
    }

    @Override
    public String deleteEmployee(Long employeeId) {
        if (employessRepository.existsById(employeeId)) {
            employessRepository.deleteById(employeeId);
            return employeeId + " deleted successfully ";
        } else {
            return employeeId + " not found ";
        }
    }


}
