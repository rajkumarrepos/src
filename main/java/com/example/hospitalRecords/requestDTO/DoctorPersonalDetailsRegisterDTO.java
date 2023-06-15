package com.example.hospitalRecords.requestDTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class DoctorPersonalDetailsRegisterDTO {
    @NotNull
    //@Max(13)
    //@Min(12)
    private Long regId;

    @NotBlank
    @Size(max=30,min=3)
    private String name;

    private String fatherName;

    private String motherName;

    //@Pattern(regexp="^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$")
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate dateOfBirth;

    private Integer experience;
    @NotBlank
    private String bloodGroup;
    @NotNull
    private Long mobileNo;
}
