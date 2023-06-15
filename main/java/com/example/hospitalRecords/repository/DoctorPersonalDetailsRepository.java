package com.example.hospitalRecords.repository;

import com.example.hospitalRecords.entity.DoctorPersonalDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorPersonalDetailsRepository extends JpaRepository<DoctorPersonalDetails,String> {
}
