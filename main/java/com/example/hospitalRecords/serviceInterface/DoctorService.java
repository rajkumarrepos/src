package com.example.hospitalRecords.serviceInterface;

import com.example.hospitalRecords.Exception.CustomException;
import com.example.hospitalRecords.entity.DoctorEntity;
import com.example.hospitalRecords.requestDTO.DoctorRegisterDTO;
import com.example.hospitalRecords.responseDTO.DoctorResponseDTO;
import com.example.hospitalRecords.responseDTO.DoctorsFullListDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface DoctorService {
    DoctorResponseDTO addDetails(DoctorRegisterDTO doctorRegisterDTO) throws CustomException;
    List<DoctorsFullListDTO> getAll();
    List<DoctorsFullListDTO> getAllDoctors(Pageable pageable) throws CustomException;
}
