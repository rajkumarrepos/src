package com.example.hospitalRecords.responseDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class DoctorsPersonalDetailsListDTO {
    private Long regId;

    private String name;

    private String fatherName;

    private String motherName;


    private LocalDateTime dateOfBirth;

    private Integer experience;


    private String bloodGroup;


    private Long mobileNo;
}
