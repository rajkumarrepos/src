package com.example.hospitalRecords.daoIMPL;

import com.example.hospitalRecords.Exception.CustomException;
import com.example.hospitalRecords.Exception.ErrorCodes;
import com.example.hospitalRecords.daoInterface.DoctorDAO;
import com.example.hospitalRecords.entity.DoctorEntity;
import com.example.hospitalRecords.repository.DoctorRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class DoctorDAOIMPL implements DoctorDAO {
    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public DoctorEntity saveInRepo(DoctorEntity doctorEntity) {
        log.info(String.valueOf(doctorEntity));
        if (!(doctorRepository.existsByRegId(doctorEntity.getRegId()))) {
            doctorRepository.save(doctorEntity);
            return doctorEntity;
        } else {
            log .info(ErrorCodes.CODE_602.name());
            log .info(ErrorCodes.CODE_602.getMessage());
            throw new CustomException(ErrorCodes.CODE_602.name(),ErrorCodes.CODE_602.getMessage());
        }
    }

    @Override
    public List<DoctorEntity> getAllDoctorsList() {
        try {
            List<DoctorEntity> doctorEntityList = doctorRepository.findAll();
            return doctorEntityList;
        } catch (Exception e) {
            throw new CustomException(ErrorCodes.CODE_603.name(), ErrorCodes.CODE_603.getMessage());
        }
    }
    @Override
     public Page<DoctorEntity> getAllDoctorsPage(Pageable pageable){
         try {
            Page<DoctorEntity> doctorEntityList = doctorRepository.findAll(pageable);
            return doctorEntityList;
       } catch (Exception e) {
           throw new CustomException(ErrorCodes.CODE_603.name(), ErrorCodes.CODE_603.getMessage());
        }
    }
}

