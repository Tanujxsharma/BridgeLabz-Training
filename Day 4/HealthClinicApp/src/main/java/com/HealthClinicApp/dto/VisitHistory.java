package com.HealthClinicApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@AllArgsConstructor
public class VisitHistory {

    private int visitId;
    private int appointmentId;
    private String diagnosis;
    private String prescription;
    private String visitNotes;

    public VisitHistory() {
    }

    public VisitHistory(int appointmentId,
                        String diagnosis,
                        String prescription,
                        String visitNotes) {

        this.appointmentId = appointmentId;
        this.diagnosis = diagnosis;
        this.prescription = prescription;
        this.visitNotes = visitNotes;
    }
}
