package com.example.hospitalRecords.requestDTO;

import jakarta.persistence.Column;
import lombok.*;

import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class DoctorDesignationUpdate {


    private String name;

    private String designation;


    private LocalDateTime joiningDate;

    private LocalDateTime updateDDate;

    private String emailId;

}
