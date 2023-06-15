package com.example.hospitalRecords.requestDTO;

import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DoctorAddressRegisterDTO {
    @NotNull
    //@Max(12)
    //@Min((12))
    private Long regId;

    @NotBlank
    @Size(max = 30,min = 3)
    private String name;

    @NotNull
    private Integer doorNo;
    @NotBlank
    private String streetName;
    @NotBlank
    private String city;
    @NotBlank
    private String state;
    @NotBlank
    private String country;
    @NotNull
    private Long pinCode;
}
