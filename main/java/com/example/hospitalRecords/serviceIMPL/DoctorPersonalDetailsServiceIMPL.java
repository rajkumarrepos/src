package com.example.hospitalRecords.serviceIMPL;

import com.example.hospitalRecords.entity.DoctorPersonalDetailsEntity;
import com.example.hospitalRecords.requestDTO.DoctorPersonalDetailsRegisterDTO;
import com.example.hospitalRecords.serviceInterface.DoctorPersonalDetailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Slf4j
@Service
public class DoctorPersonalDetailsServiceIMPL implements DoctorPersonalDetailService {

    public DoctorPersonalDetailsEntity register(DoctorPersonalDetailsRegisterDTO doctorPersonalDetailsRegisterDTO){
        DoctorPersonalDetailsEntity doctorPersonalDetailsEntity = new DoctorPersonalDetailsEntity();

        BeanUtils.copyProperties(doctorPersonalDetailsRegisterDTO, doctorPersonalDetailsEntity);
        log.info("------------------------------");

        return doctorPersonalDetailsEntity;
    }
}
