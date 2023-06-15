package com.example.hospitalRecords.requestDTO;

import jakarta.persistence.Column;
import lombok.*;

import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DoctorAddressRegister {

    private Long regId;

    private String name;


    private Integer doorNo;

    private String streetName;
    private String city;

    private String state;
    private String country;

    private Long pinCode;
}
