package com.example.hospitalRecords.serviceIMPL;

import com.example.hospitalRecords.Exception.CustomException;
import com.example.hospitalRecords.Exception.ErrorCodes;
import com.example.hospitalRecords.daoIMPL.PatientsDAOIMPL;
import com.example.hospitalRecords.daoInterface.PatientsDAO;
import com.example.hospitalRecords.entity.PatientsEntity;
import com.example.hospitalRecords.requestDTO.PatientsRegisterDTO;
import com.example.hospitalRecords.responseDTO.PatientsResponseDTO;
import com.example.hospitalRecords.serviceInterface.PatientsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class patientsServiceIMPL implements PatientsService {
    @Autowired
    private PatientsDAO patientsDAO;

    public PatientsResponseDTO addPatients(PatientsRegisterDTO patientsRegisterDTO){
        PatientsEntity patientsEntity = new PatientsEntity();
        log.info(String.valueOf(patientsRegisterDTO));
        //BeanUtils.copyProperties(patientsRegisterDTO,patientsEntity);
        BeanUtils.copyProperties(patientsRegisterDTO,patientsEntity);
        log.info(String.valueOf(patientsEntity));
        patientsDAO.addPatientsVaiDAO(patientsEntity);
        try{
            PatientsResponseDTO patientsResponseDTO = new PatientsResponseDTO();
            BeanUtils.copyProperties(patientsEntity,patientsResponseDTO);
            return patientsResponseDTO;
        }catch(Exception e){
            throw new CustomException(ErrorCodes.CODE_605.name(),ErrorCodes.CODE_605.getMessage());
        }
    }


}
