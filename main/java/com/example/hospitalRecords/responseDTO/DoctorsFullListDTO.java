package com.example.hospitalRecords.responseDTO;


import com.example.hospitalRecords.entity.DoctorPersonalDetailsEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class DoctorsFullListDTO {


    private Long regId;

    private String name;

    private String designation;


    private LocalDateTime joiningDate;

    private LocalDateTime updatedDate;

    private String emailId;

    private DoctorPersonalDetailsReposeDTO doctorPersonalDetailsReposeDTO;

    private DoctorAddressResponseDTO doctorAddressResponseDTO;
}
