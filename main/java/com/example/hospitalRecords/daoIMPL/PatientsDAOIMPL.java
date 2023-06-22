package com.example.hospitalRecords.daoIMPL;

import com.example.hospitalRecords.Exception.CustomException;
import com.example.hospitalRecords.Exception.ErrorCodes;
import com.example.hospitalRecords.daoInterface.PatientsDAO;
import com.example.hospitalRecords.entity.PatientsEntity;
import com.example.hospitalRecords.repository.PatientsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static org.hibernate.query.sqm.tree.SqmNode.log;
@Slf4j
@Service
public class PatientsDAOIMPL implements PatientsDAO {
    @Autowired
    private PatientsRepository patientsRepository;
    public void addPatientsVaiDAO(PatientsEntity patientsEntity){
        log.info(String.valueOf(patientsEntity));
        try{
            patientsRepository.save(patientsEntity);
        }catch(Exception e){
            throw new CustomException(ErrorCodes.CODE_603.name(),ErrorCodes.CODE_603.getMessage());
        }

    }
}
