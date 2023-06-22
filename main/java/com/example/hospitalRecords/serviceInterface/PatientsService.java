package com.example.hospitalRecords.serviceInterface;

import com.example.hospitalRecords.requestDTO.PatientsRegisterDTO;
import com.example.hospitalRecords.responseDTO.PatientsResponseDTO;

public interface PatientsService {
    PatientsResponseDTO addPatients(PatientsRegisterDTO patientsRegisterDTO);
}
