package com.HealthClinicApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Specialization {

    private int specializationId;
    private String name;
    private String description;

    public Specialization() {
    }

    public Specialization(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
