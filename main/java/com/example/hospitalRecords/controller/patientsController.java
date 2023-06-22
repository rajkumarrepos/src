package com.example.hospitalRecords.controller;

import com.example.hospitalRecords.requestDTO.PatientsRegisterDTO;
import com.example.hospitalRecords.responseDTO.PatientsResponseDTO;
import com.example.hospitalRecords.serviceInterface.PatientsService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Validated
@RestController
@RequestMapping(value ="api/v1/patients")
@Slf4j
public class patientsController {
    @Autowired
    private PatientsService patientsService;

    @PostMapping(value="/register")
    public PatientsResponseDTO registration(@RequestBody @Valid PatientsRegisterDTO patientsRegisterDTO){
        log.info(String.valueOf(patientsRegisterDTO));
             PatientsResponseDTO patientsRegisterDetails= patientsService.addPatients(patientsRegisterDTO);
             return patientsRegisterDetails;
    }

}
