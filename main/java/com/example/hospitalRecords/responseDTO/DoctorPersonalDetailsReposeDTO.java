package com.example.hospitalRecords.responseDTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import lombok.*;

import java.time.LocalDate;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DoctorPersonalDetailsReposeDTO {

    private Long regId;


    private String name;

    private String fatherName;

    private String motherName;

    private LocalDate dateOfBirth;

    private Integer experience;


    private String bloodGroup;


    private Long mobileNo;

}
