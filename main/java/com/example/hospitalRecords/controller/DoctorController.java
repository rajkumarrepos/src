package com.example.hospitalRecords.controller;

import com.example.hospitalRecords.Exception.CustomException;
import com.example.hospitalRecords.entity.DoctorEntity;
import com.example.hospitalRecords.requestDTO.DoctorRegisterDTO;
import com.example.hospitalRecords.responseDTO.DoctorResponseDTO;
import com.example.hospitalRecords.responseDTO.DoctorsFullListDTO;
import com.example.hospitalRecords.serviceInterface.DoctorService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

import static org.springframework.data.domain.PageRequest.ofSize;

@Slf4j
@RestController
@RequestMapping("api/v1/doctor")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;
    @PostMapping(value="/register")
    public DoctorResponseDTO register(@Valid  @RequestBody DoctorRegisterDTO doctorRegisterDTO){
    log.info(String.valueOf(doctorRegisterDTO));
        DoctorResponseDTO registeredObject = doctorService.addDetails(doctorRegisterDTO);
    return registeredObject;
    }
    @GetMapping(value = "/getalldoctor")
    public List<DoctorsFullListDTO> get(){

        List<DoctorsFullListDTO> doctorsFullListDTOS=doctorService.getAll();
       return doctorsFullListDTOS;
    }
    @GetMapping(value = "/getalldoctors/{page}/{size}/{column}")
    public List<DoctorsFullListDTO> getBYPaging(@PathVariable (value = "page") int page, @PathVariable(value = "size") int size,@PathVariable(value="column") String column) throws CustomException {
        Pageable pageable = PageRequest.of(page,size,Sort.by(column));

        List<DoctorsFullListDTO> doctorsFullListDTOS=doctorService.getAllDoctors(pageable);

        return doctorsFullListDTOS;
    }
}
