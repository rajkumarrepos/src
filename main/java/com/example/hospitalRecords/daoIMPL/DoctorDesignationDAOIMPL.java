package com.example.hospitalRecords.daoIMPL;

import com.example.hospitalRecords.Exception.CustomException;
import com.example.hospitalRecords.daoInterface.DoctorDesignationDAO;
import com.example.hospitalRecords.entity.DoctorDesignation;
import com.example.hospitalRecords.repository.DoctorDesignationRepository;
import com.example.hospitalRecords.serviceInterface.DoctorDesignationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class DoctorDesignationDAOIMPL implements DoctorDesignationDAO {
    @Autowired
    private DoctorDesignationRepository doctorDesignationRepository;

    public DoctorDesignation saveInRepo(DoctorDesignation doctorDesignation){
        log.info(String.valueOf(doctorDesignation));
       if (!(doctorDesignationRepository.existsByRegId(doctorDesignation.getRegId()))) {
            doctorDesignationRepository.save(doctorDesignation);
            return doctorDesignation;
        }
        else
        {
            throw new CustomException("601", "Already the regId in table,so you have to update the data");
        }
        }
    }

