package com.example.hospitalRecords.daoInterface;

import com.example.hospitalRecords.entity.DoctorEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface DoctorDAO {
    DoctorEntity saveInRepo(DoctorEntity doctorEntity);
     List<DoctorEntity> getAllDoctorsList();
    Page<DoctorEntity> getAllDoctorsPage(Pageable pageable);
}
