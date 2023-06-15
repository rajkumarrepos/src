package com.example.hospitalRecords.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class DoctorPersonalDetails {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name ="uuid2", strategy = "uuid2" )
    private String id;

    @Column(name="reg_id",length=12,nullable = false,unique = true)
    private Long regId;

    @Column(name="name",length = 30,nullable = false)
    private String name;

    private String fatherName;

    private String motherName;

    @Column(nullable = false)
    private String dateOfBirth;

    private Integer experience;

    @Column(nullable = false)
    private String bloodGroup;

    @Column(nullable = false,unique = true)
    private Long mobileNo;




}
