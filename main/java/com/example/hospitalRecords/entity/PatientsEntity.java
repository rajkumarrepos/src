package com.example.hospitalRecords.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDate;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class PatientsEntity {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name ="uuid2", strategy = "uuid2" )
    private String id;
    @Column(length =8,nullable = false)
    private Long patientID;
    @Column(length =30,nullable = false)
    private String name;
    @Column(length =3,nullable = false)
    private Integer age;
    @Column(length =10,nullable = false)
    private LocalDate dateOfBirth;
    @JsonFormat(pattern="yyyy-MM-dd")
    private String emailId;
}
