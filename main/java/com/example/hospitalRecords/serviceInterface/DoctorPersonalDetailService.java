package com.example.hospitalRecords.serviceInterface;

import com.example.hospitalRecords.entity.DoctorPersonalDetails;
import com.example.hospitalRecords.requestDTO.DoctorDesignationRegister;
import com.example.hospitalRecords.requestDTO.DoctorPersonalDetailsRegister;

public interface DoctorPersonalDetailService {
    DoctorPersonalDetails register(DoctorPersonalDetailsRegister doctorPersonalDetailsRegister);
}
