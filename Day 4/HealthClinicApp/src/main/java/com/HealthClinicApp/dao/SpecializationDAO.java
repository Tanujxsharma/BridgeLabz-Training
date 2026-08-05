package com.HealthClinicApp.dao;

import com.HealthClinicApp.dto.Specialization;

import java.util.List;

public interface SpecializationDAO {

    int addSpecialization(Specialization specialization);

    Specialization getSpecializationById(int specializationId);

    List<Specialization> getAllSpecializations();

    boolean updateSpecialization(Specialization specialization);

    boolean deleteSpecialization(int specializationId);
}
