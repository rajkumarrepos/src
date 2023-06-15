package com.example.hospitalRecords.serviceInterface;

import com.example.hospitalRecords.entity.DoctorsAddressEntity;
import com.example.hospitalRecords.requestDTO.DoctorAddressRegisterDTO;

public interface DoctorAddressService {
    DoctorsAddressEntity register(DoctorAddressRegisterDTO doctorAddressRegisterDTO);
}
