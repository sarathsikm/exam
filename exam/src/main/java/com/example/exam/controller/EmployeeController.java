package com.example.exam.controller;

import com.example.exam.contract.EmployeeRequest;
import com.example.exam.contract.EmployeeResponse;
import com.example.exam.contract.Response;
import com.example.exam.model.Employee;
import com.example.exam.service.EmployeeService;

import io.swagger.v3.oas.annotations.Operation;

import jakarta.validation.Valid;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employee")
@Validated
public class EmployeeController {

    private final EmployeeService employeeService;

    @SneakyThrows
    @Operation(summary = "Save Employee Details")
    @PostMapping(value = {"/save"})
    public ResponseEntity<?> saveEmployeeDetails(@Valid @RequestBody EmployeeRequest request) {
        Employee employee = employeeService.saveEmployee(request);
        EmployeeResponse employeeResponse =
                EmployeeResponse.builder().empId(employee.getEmpid()).build();

        return new ResponseEntity<>(
                Response.<EmployeeResponse>builder()
                        .payload(employeeResponse)
                        .message("Successfully Saved")
                        .build(),
                HttpStatus.CREATED);
    }
}
