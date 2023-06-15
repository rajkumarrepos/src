package com.example.hospitalRecords.serviceIMPL;

import com.example.hospitalRecords.entity.DoctorsAddress;
import com.example.hospitalRecords.requestDTO.DoctorAddressRegister;
import com.example.hospitalRecords.requestDTO.DoctorDesignationRegister;
import com.example.hospitalRecords.serviceInterface.DoctorAddressService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class DoctorAddressServiceIMPL implements DoctorAddressService {

    public DoctorsAddress register(DoctorAddressRegister doctorAddressRegister){
        DoctorsAddress doctorsAddress = new DoctorsAddress();

        BeanUtils.copyProperties(doctorAddressRegister,doctorsAddress);
        return doctorsAddress;
    }
}
