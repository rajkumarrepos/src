package com.example.hospitalRecords.repository;

import com.example.hospitalRecords.entity.DoctorEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<DoctorEntity,String> {
    boolean existsByRegId(Long regId);
    Page<DoctorEntity> findAll(Pageable pageable);

}
