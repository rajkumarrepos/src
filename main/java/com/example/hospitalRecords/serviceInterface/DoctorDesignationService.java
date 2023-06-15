package com.example.hospitalRecords.serviceInterface;

import com.example.hospitalRecords.entity.DoctorDesignation;
import com.example.hospitalRecords.requestDTO.DoctorDesignationRegister;

public interface DoctorDesignationService {
    DoctorDesignation addDetails(DoctorDesignationRegister doctorDesignationRegister);
}
