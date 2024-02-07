package com.example.exam.model;

import jakarta.persistence.*;

import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Builder
@Setter
@Getter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee_details")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID empid;

    private String fullname;
    private String designation;
    private String mobile;
    private String email;
    private LocalDate dateOfBirth;
}
