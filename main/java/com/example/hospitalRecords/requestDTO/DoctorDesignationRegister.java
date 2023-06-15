package com.example.hospitalRecords.requestDTO;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Pattern;
import lombok.*;

import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Setter
@Getter
@ToString
public class DoctorDesignationRegister {


    private Long regId;


    private String name;


    private String designation;

    private String emailId;

    private DoctorPersonalDetailsRegister doctorPersonalDetailsRegister;

    private DoctorAddressRegister doctorAddressRegister;

}
