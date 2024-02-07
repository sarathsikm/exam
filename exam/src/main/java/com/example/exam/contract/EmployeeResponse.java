package com.example.exam.contract;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeResponse {

    private UUID empId;
    private String fullName;
    private String designation;
    private String mobile;
    private String email;
    private LocalDate dateOfBirth;
}
