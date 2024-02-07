package com.example.exam.contract;

import com.example.exam.validation.CurrentDate;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeRequest {

    private UUID empId;

    @NotEmpty(message = "Employee Name cannot be empty")
    private String fullName;

    @NotEmpty(message = "Employee designation cannot be empty")
    private String designation;

    @NotEmpty(message = "Employee Mobile Number cannot be empty")
    private String mobile;

    @NotEmpty(message = "Employee email cannot be empty")
    private String email;

    @JsonFormat(pattern = "dd-MM-yyyy")
    @CurrentDate
    @NotNull(message = "Date of birth cannot be empty")
    private LocalDate dateOfBirth;
}
