package com.example.hospitalRecords.repository;

import com.example.hospitalRecords.entity.DoctorsAddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorAddressRepository extends JpaRepository<DoctorsAddressEntity,String> {
}
