package com.example.hospitalRecords.serviceInterface;

import com.example.hospitalRecords.entity.DoctorPersonalDetailsEntity;
import com.example.hospitalRecords.requestDTO.DoctorPersonalDetailsRegisterDTO;
import com.example.hospitalRecords.responseDTO.DoctorsFullListDTO;

import java.util.List;

public interface DoctorPersonalDetailService {
    DoctorPersonalDetailsEntity register(DoctorPersonalDetailsRegisterDTO doctorPersonalDetailsRegisterDTO);

}
