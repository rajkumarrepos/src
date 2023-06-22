package com.example.hospitalRecords.repository;

import com.example.hospitalRecords.entity.PatientsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientsRepository extends JpaRepository<PatientsEntity,String> {
}
