package com.example.hospitalRecords;


import jakarta.validation.ConstraintValidator;

import jakarta.validation.ConstraintValidatorContext;
import org.hibernate.validator.constraintvalidation.HibernateConstraintValidatorContext;

import java.time.LocalDate;
import java.util.Date;


public class AgeValidator implements ConstraintValidator<AgeConstraint, Integer> {
        @Override
        public void initialize(AgeConstraint constraintAnnotation) {
            // No initialization needed
        }


    @Override
        public boolean isValid(Integer age, ConstraintValidatorContext context) {
            if (age == null) {
                return true; // Let @NotNull annotation handle null check
            }

            // Calculate the minimum age allowed (e.g., 18)
            int minimumAge = 18;

            // Get the current date
            LocalDate currentDate = LocalDate.now();

            // Calculate the minimum date of birth based on the age
            LocalDate minimumDateOfBirth = currentDate.minusYears(minimumAge);

            // Get the date of birth from the context
                return minimumDateOfBirth.isBefore(minimumDateOfBirth);
            }

}

