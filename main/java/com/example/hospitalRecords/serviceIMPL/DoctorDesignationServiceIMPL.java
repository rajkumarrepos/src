package com.example.hospitalRecords.serviceIMPL;

import com.example.hospitalRecords.Exception.CustomException;
import com.example.hospitalRecords.Exception.ErrorCodes;
import com.example.hospitalRecords.daoInterface.DoctorDesignationDAO;
import com.example.hospitalRecords.entity.DoctorDesignation;
import com.example.hospitalRecords.entity.DoctorPersonalDetails;
import com.example.hospitalRecords.entity.DoctorsAddress;
import com.example.hospitalRecords.requestDTO.DoctorDesignationRegister;
import com.example.hospitalRecords.serviceInterface.DoctorAddressService;
import com.example.hospitalRecords.serviceInterface.DoctorDesignationService;
import com.example.hospitalRecords.serviceInterface.DoctorPersonalDetailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
@Slf4j
@Service
public class DoctorDesignationServiceIMPL implements DoctorDesignationService {
    @Autowired
    private DoctorPersonalDetailService doctorPersonalDetailService;
    @Autowired
    private DoctorAddressService doctorAddressService;
    @Autowired
    private DoctorDesignationDAO doctorDesignationDAO;
    @Override
    public DoctorDesignation addDetails(DoctorDesignationRegister doctorDesignationRegister){
        log.info(String.valueOf(doctorDesignationRegister));

        log.info(String.valueOf(doctorDesignationRegister.getDoctorPersonalDetailsRegister()));

        log.info(String.valueOf(doctorDesignationRegister.getDoctorAddressRegister()));
       if(doctorDesignationRegister.getRegId().toString().length()==12){
           DoctorPersonalDetails doctorPersonalDetails =doctorPersonalDetailService.register(doctorDesignationRegister.getDoctorPersonalDetailsRegister());
           DoctorsAddress doctorsAddress =doctorAddressService.register(doctorDesignationRegister.getDoctorAddressRegister());

           DoctorDesignation doctorDesignation = new DoctorDesignation();
           BeanUtils.copyProperties(doctorDesignationRegister,doctorDesignation);

           doctorDesignation.setJoiningDate(LocalDateTime.now());
           doctorDesignation.setDoctorPersonalDetails(doctorPersonalDetails);
           doctorDesignation.setDoctorsAddress(doctorsAddress);
           log.info("doctorDesignation : {}",doctorDesignation.toString());
           doctorDesignationDAO.saveInRepo(doctorDesignation);

           return doctorDesignation;

       }
       else{
           throw new CustomException(ErrorCodes.CODE_602.name(), ErrorCodes.CODE_602.getMessage());
       }
    }
}
