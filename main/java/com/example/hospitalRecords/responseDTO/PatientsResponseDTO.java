package com.example.hospitalRecords.responseDTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PatientsResponseDTO {

    private Long patientID;

    private String name;

    private Integer age;

    private LocalDate dateOfBirth;

    private String emailId;
}
