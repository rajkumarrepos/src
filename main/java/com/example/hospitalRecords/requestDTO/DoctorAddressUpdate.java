package com.example.hospitalRecords.requestDTO;

import jakarta.persistence.Column;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DoctorAddressUpdate {


    private Integer doorNo;

    private String streetName;

    private String city;

    private String state;

    private String country;
    private Long pinCode;

}
