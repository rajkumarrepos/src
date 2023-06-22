package com.example.hospitalRecords.requestDTO;

import com.example.hospitalRecords.AgeConstraint;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.validation.constraints.*;
import lombok.*;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

import java.lang.Long;



import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PatientsRegisterDTO {
    @NotNull
    private Long patientID;
    @NotBlank
    private String name;
    @NotNull
    //@AgeConstraint(message = "Invalid age")
    private Integer age;
    @NotNull
    @Past(message = "Date of birth must be in the past")
    private LocalDate dateOfBirth;
    @JsonFormat(pattern="yyyy-MM-dd")
    private String emailId;
}
