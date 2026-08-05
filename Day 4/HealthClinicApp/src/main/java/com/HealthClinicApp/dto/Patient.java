package com.HealthClinicApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Patient {
    private int patientId;
    private String firstName;
    private String lastName;
    private String email;
    private Date dateOfBirth;
    private String gender;
    private String phoneNumber;
    private boolean active;


    public Patient(String firstName, String lastName,
                   Date dateOfBirth,
                   String gender,
                   String phoneNumber,
                   String email,
                   boolean active) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.active = active;
    }

}
