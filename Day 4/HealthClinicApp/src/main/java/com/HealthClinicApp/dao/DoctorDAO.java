package com.HealthClinicApp.dao;

import com.HealthClinicApp.dto.Doctor;

import java.util.List;

public interface DoctorDAO {

    int addDoctor(Doctor doctor);

    Doctor getDoctorById(int doctorId);

    List<Doctor> getAllDoctors();

    boolean updateDoctor(Doctor doctor);

    boolean deleteDoctor(int doctorId);
}
