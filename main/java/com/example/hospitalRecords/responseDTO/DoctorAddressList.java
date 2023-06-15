package com.example.hospitalRecords.responseDTO;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class DoctorAddressList {

    private Long regId;
    private Integer doorNo;

    private String streetName;

    private String city;

    private String state;

    private String country;

    private Long pinCode;

}
