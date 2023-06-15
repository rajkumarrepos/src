package com.example.hospitalRecords.responseDTO;

import com.example.hospitalRecords.entity.DoctorPersonalDetailsEntity;
import com.example.hospitalRecords.entity.DoctorsAddressEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@AllArgsConstructor
@Setter
@NoArgsConstructor
public class DoctorResponseDTO {
    private Long regId;

    private String name;

    private String designation;


    private LocalDateTime joiningDate;

    private LocalDateTime updatedDate;

    private String emailId;

    private DoctorPersonalDetailsReposeDTO doctorPersonalDetailsReposeDTO;

    private DoctorAddressResponseDTO doctorAddressResponseDTO;
}
