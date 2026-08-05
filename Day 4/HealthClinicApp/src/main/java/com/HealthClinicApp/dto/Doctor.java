package com.HealthClinicApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Doctor {
    private int doctorId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private boolean active;


    public Doctor(String firstName, String lastName,
                  String phoneNumber,
                  String email,
                  boolean active) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.active = active;
    }

}
