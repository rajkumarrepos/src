package com.example.hospitalRecords.controller;

import com.example.hospitalRecords.entity.DoctorDesignation;
import com.example.hospitalRecords.requestDTO.DoctorDesignationRegister;
import com.example.hospitalRecords.serviceInterface.DoctorDesignationService;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.hibernate.query.sqm.tree.SqmNode.log;
@Slf4j
@RestController
@RequestMapping("api/v1/doctor")
public class DoctorDesignationController {
    @Autowired
    private DoctorDesignationService doctorDesignationService;
    @PostMapping(value="/register")
    public DoctorDesignation register(@RequestBody DoctorDesignationRegister doctorDesignationRegister){
    log.info(String.valueOf(doctorDesignationRegister));
        DoctorDesignation registeredObject = doctorDesignationService.addDetails(doctorDesignationRegister);
    return registeredObject;
    }
   /* @GetMapping(value = "/{id}")
    public ResponseEntity<DoctorDesignation> get(@PathVariable (value="id") Long regId){
        ResponseEntity<DoctorDesignation> doctorDesignation=doctorDesignationService.getID(regId);
       return doctorDesignation;
    }       */

}
