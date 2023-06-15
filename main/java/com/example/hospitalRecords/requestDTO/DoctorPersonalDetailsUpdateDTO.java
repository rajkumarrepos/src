package com.example.hospitalRecords.requestDTO;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class DoctorPersonalDetailsUpdateDTO {



    private String name;

    private String fatherName;

    private String motherName;

    private String dateOfBirth;

    private Integer experience;


    private String bloodGroup;


    private Long mobileNo;
}
