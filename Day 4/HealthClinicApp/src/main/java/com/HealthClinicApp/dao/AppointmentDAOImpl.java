package com.HealthClinicApp.dao;

import com.HealthClinicApp.config.DatabaseConnection;
import com.HealthClinicApp.dto.Appointment;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AppointmentDAOImpl implements AppointmentDAO{


    @Override
    public int addAppointment(Appointment appointment) {

        String sql = """
            INSERT INTO appointments
            (patient_id, doctor_id, appointment_date, status)
            VALUES (?, ?, ?, ?)
            """;

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement =
                     connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            preparedStatement.setInt(1, appointment.getPatientId());
            preparedStatement.setInt(2, appointment.getDoctorId());
            preparedStatement.setTimestamp(3, Timestamp.valueOf(appointment.getAppointmentDate()));
            preparedStatement.setString(4, appointment.getStatus());

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {

                ResultSet resultSet = preparedStatement.getGeneratedKeys();

                if (resultSet.next()) {
                    return resultSet.getInt(1);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return -1;
    }

    @Override
    public Appointment getAppointmentById(int appointmentId) {

        String sql = "SELECT * FROM appointments WHERE appointment_id = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, appointmentId);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {

                Appointment appointment = new Appointment();

                appointment.setAppointmentId(resultSet.getInt("appointment_id"));
                appointment.setPatientId(resultSet.getInt("patient_id"));
                appointment.setDoctorId(resultSet.getInt("doctor_id"));
                appointment.setAppointmentDate(resultSet.getTimestamp("appointment_date").toLocalDateTime());
                appointment.setStatus(resultSet.getString("status"));

                return appointment;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<Appointment> getAllAppointments() {

        List<Appointment> appointments = new ArrayList<>();

        String sql = "SELECT * FROM appointments";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {

                Appointment appointment = new Appointment();

                appointment.setAppointmentId(resultSet.getInt("appointment_id"));
                appointment.setPatientId(resultSet.getInt("patient_id"));
                appointment.setDoctorId(resultSet.getInt("doctor_id"));
                appointment.setAppointmentDate(resultSet.getTimestamp("appointment_date").toLocalDateTime());
                appointment.setStatus(resultSet.getString("status"));

                appointments.add(appointment);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return appointments;
    }

    @Override
    public boolean updateAppointment(Appointment appointment) {

        String sql = """
            UPDATE appointments
            SET patient_id = ?,
                doctor_id = ?,
                appointment_date = ?,
                status = ?
            WHERE appointment_id = ?
            """;

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, appointment.getPatientId());
            preparedStatement.setInt(2, appointment.getDoctorId());
            preparedStatement.setTimestamp(3, Timestamp.valueOf(appointment.getAppointmentDate()));
            preparedStatement.setString(4, appointment.getStatus());
            preparedStatement.setInt(5, appointment.getAppointmentId());

            return preparedStatement.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean deleteAppointment(int appointmentId) {

        String sql = "DELETE FROM appointments WHERE appointment_id = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, appointmentId);

            return preparedStatement.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}
