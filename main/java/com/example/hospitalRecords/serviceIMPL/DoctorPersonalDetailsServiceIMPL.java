package com.example.hospitalRecords.serviceIMPL;

import com.example.hospitalRecords.entity.DoctorPersonalDetails;
import com.example.hospitalRecords.requestDTO.DoctorDesignationRegister;
import com.example.hospitalRecords.requestDTO.DoctorPersonalDetailsRegister;
import com.example.hospitalRecords.serviceInterface.DoctorPersonalDetailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import static org.hibernate.query.sqm.tree.SqmNode.log;

@Slf4j
@Service
public class DoctorPersonalDetailsServiceIMPL implements DoctorPersonalDetailService {

    public DoctorPersonalDetails register(DoctorPersonalDetailsRegister doctorPersonalDetailsRegister){
        DoctorPersonalDetails doctorPersonalDetails = new DoctorPersonalDetails();

        BeanUtils.copyProperties(doctorPersonalDetailsRegister,doctorPersonalDetails);
        log.info("------------------------------");

        return doctorPersonalDetails;
    }
}
