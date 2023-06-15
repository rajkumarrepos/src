package com.example.hospitalRecords.requestDTO;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DoctorAddressUpdateDTO {


    private Integer doorNo;

    private String streetName;

    private String city;

    private String state;

    private String country;
    private Long pinCode;

}
