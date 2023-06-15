package com.example.hospitalRecords.requestDTO;

import jakarta.validation.constraints.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Setter
@Getter
@ToString
public class DoctorRegisterDTO {

    @NotNull
    //@Max(12)
    //@Min(12)
    private Long regId;

    @NotBlank
    private String name;

    @NotBlank
    private String designation;

    @Email
    private String emailId;

    private DoctorPersonalDetailsRegisterDTO doctorPersonalDetailsRegisterDTO;

    private DoctorAddressRegisterDTO doctorAddressRegisterDTO;

}
