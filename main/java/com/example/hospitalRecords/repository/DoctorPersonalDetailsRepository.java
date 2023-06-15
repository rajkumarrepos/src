package com.example.hospitalRecords.repository;

import com.example.hospitalRecords.entity.DoctorPersonalDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorPersonalDetailsRepository extends JpaRepository<DoctorPersonalDetailsEntity,String> {
}
