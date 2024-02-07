package com.example.exam.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@RequiredArgsConstructor
public class CurrentDateValidator implements ConstraintValidator<CurrentDate, LocalDate> {

    @Override
    public void initialize(CurrentDate constraintAnnotation) {}

    @Override
    public boolean isValid(LocalDate date, ConstraintValidatorContext context) {
        if (date == null) {
            return false; // Let other validators handle null
        }

        LocalDate currentDate = LocalDate.now();

        return date.isBefore(currentDate);
    }
}
