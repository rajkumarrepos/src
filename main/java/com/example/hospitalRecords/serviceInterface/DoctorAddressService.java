package com.example.hospitalRecords.serviceInterface;

import com.example.hospitalRecords.entity.DoctorsAddress;
import com.example.hospitalRecords.requestDTO.DoctorAddressRegister;
import com.example.hospitalRecords.requestDTO.DoctorDesignationRegister;

public interface DoctorAddressService {
    DoctorsAddress register(DoctorAddressRegister doctorAddressRegister);
}
