package com.HealthClinicApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
public class Appointment {

    private int appointmentId;
    private int patientId;
    private int doctorId;
    private LocalDateTime appointmentDate;
    private String status;

    public Appointment() {
    }

    public Appointment(int patientId,
                       int doctorId,
                       LocalDateTime appointmentDate,
                       String status) {

        this.patientId = patientId;
        this.doctorId = doctorId;
        this.appointmentDate = appointmentDate;
        this.status = status;
    }
}
