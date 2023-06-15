package com.example.hospitalRecords.serviceIMPL;

import com.example.hospitalRecords.entity.DoctorsAddressEntity;
import com.example.hospitalRecords.requestDTO.DoctorAddressRegisterDTO;
import com.example.hospitalRecords.serviceInterface.DoctorAddressService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class DoctorAddressServiceIMPL implements DoctorAddressService {

    public DoctorsAddressEntity register(DoctorAddressRegisterDTO doctorAddressRegisterDTO){
        DoctorsAddressEntity doctorsAddressEntity = new DoctorsAddressEntity();

        BeanUtils.copyProperties(doctorAddressRegisterDTO, doctorsAddressEntity);
        return doctorsAddressEntity;
    }
}
