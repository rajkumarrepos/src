package com.example.hospitalRecords.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class DoctorPersonalDetailsEntity {
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
    //@Pattern(regexp="^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$")
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate dateOfBirth;

    private Integer experience;

    @Column(nullable = false)
    private String bloodGroup;

    @Column(nullable = false,unique = true)
    private Long mobileNo;





}
