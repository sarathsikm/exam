package com.example.exam.service;

import com.example.exam.contract.EmployeeRequest;
import com.example.exam.model.Employee;
import com.example.exam.repository.EmployeeRepository;

import lombok.RequiredArgsConstructor;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final ModelMapper modelMapper = new ModelMapper();
    private final EmployeeRepository employeeRepository;

    public Employee saveEmployee(EmployeeRequest request) {

        Employee employee = modelMapper.map(request, Employee.class);
        employeeRepository.save(employee);
        return employee;
    }
}
