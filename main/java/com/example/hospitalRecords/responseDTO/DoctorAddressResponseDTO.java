package com.example.hospitalRecords.responseDTO;

import jakarta.persistence.Column;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DoctorAddressResponseDTO {
    private Long regId;


    private String name;


    private Integer doorNo;


    private String streetName;

    private String city;


    private String state;

    private String country;

    private Long pinCode;


}
