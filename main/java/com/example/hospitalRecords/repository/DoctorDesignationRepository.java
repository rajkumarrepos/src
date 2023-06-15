package com.example.hospitalRecords.repository;

import com.example.hospitalRecords.entity.DoctorDesignation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorDesignationRepository extends JpaRepository<DoctorDesignation,String> {
    boolean existsByRegId(Long regId);

}
