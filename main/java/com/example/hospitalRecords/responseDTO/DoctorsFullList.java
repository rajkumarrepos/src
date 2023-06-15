package com.example.hospitalRecords.responseDTO;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class DoctorsFullList {


    private Long regId;

    private String name;

    private String designation;


    private LocalDateTime joiningDate;

    private LocalDateTime updatedDate;

    private String emailId;
}
