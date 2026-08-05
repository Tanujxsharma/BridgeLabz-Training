package com.HealthClinicApp.dao;

import com.HealthClinicApp.dto.Patient;

import java.util.List;

public interface PatientDAO {
    int addPatient(Patient patient);

    Patient getPatientById(int patientId);

    List<Patient> getAllPatient();

    boolean updatePatient(Patient patient);

    boolean deletePatient(int patientId);

}
