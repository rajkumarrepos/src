package com.example.hospitalRecords.requestDTO;

import lombok.*;

import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class DoctorPersonalDetailsUpdate {



    private String name;

    private String fatherName;

    private String motherName;

    private String dateOfBirth;

    private Integer experience;


    private String bloodGroup;


    private Long mobileNo;
}
