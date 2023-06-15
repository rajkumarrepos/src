package com.example.hospitalRecords.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class DoctorDesignation {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name ="uuid2", strategy = "uuid2" )
    private String id;

    @Column(name="reg_id",length =12,nullable = false,unique = true)
    private Long regId;

    @Column(name="name",length = 30,nullable = false)
    private String name;

    @Column(name="designation",length = 30,nullable = false)
    private String designation;

    @Column(name="joining_date",nullable = false)
    private LocalDateTime joiningDate;

    private LocalDateTime updatedDate;

    @Column(name="email_id")
    private String emailId;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private DoctorPersonalDetails doctorPersonalDetails;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private DoctorsAddress doctorsAddress;


}
