package com.HealthClinicApp.dao;

import com.HealthClinicApp.dto.Appointment;

import java.util.List;

public interface AppointmentDAO {

    int addAppointment(Appointment appointment);

    Appointment getAppointmentById(int appointmentId);

    List<Appointment> getAllAppointments();

    boolean updateAppointment(Appointment appointment);

    boolean deleteAppointment(int appointmentId);
}
