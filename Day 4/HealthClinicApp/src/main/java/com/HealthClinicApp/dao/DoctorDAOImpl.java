package com.HealthClinicApp.dao;

import com.HealthClinicApp.config.DatabaseConnection;
import com.HealthClinicApp.dto.Doctor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DoctorDAOImpl implements DoctorDAO {


    @Override
    public int addDoctor(Doctor doctor) {

        String sql = """
            INSERT INTO doctors
            (first_name, last_name, phone_number, email, is_active)
            VALUES (?, ?, ?, ?, ?)
            """;

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement =
                     connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            preparedStatement.setString(1, doctor.getFirstName());
            preparedStatement.setString(2, doctor.getLastName());
            preparedStatement.setString(3, doctor.getPhoneNumber());
            preparedStatement.setString(4, doctor.getEmail());
            preparedStatement.setBoolean(5, doctor.isActive());

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
    public Doctor getDoctorById(int doctorId) {
        String sql = "SELECT * FROM doctors WHERE doctor_id = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, doctorId);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {

                Doctor doctor = new Doctor();

                doctor.setDoctorId(resultSet.getInt("doctor_id"));
                doctor.setFirstName(resultSet.getString("first_name"));
                doctor.setLastName(resultSet.getString("last_name"));
                doctor.setPhoneNumber(resultSet.getString("phone_number"));
                doctor.setEmail(resultSet.getString("email"));
                doctor.setActive(resultSet.getBoolean("is_active"));

                return doctor;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<Doctor> getAllDoctors() {
        List<Doctor> doctors = new ArrayList<>();

        String sql = "SELECT * FROM doctors";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {

                Doctor doctor = new Doctor();

                doctor.setDoctorId(resultSet.getInt("doctor_id"));
                doctor.setFirstName(resultSet.getString("first_name"));
                doctor.setLastName(resultSet.getString("last_name"));
                doctor.setPhoneNumber(resultSet.getString("phone_number"));
                doctor.setEmail(resultSet.getString("email"));
                doctor.setActive(resultSet.getBoolean("is_active"));

                doctors.add(doctor);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return doctors;
    }

    @Override
    public boolean updateDoctor(Doctor doctor) {
        String sql = """
            UPDATE doctors
            SET first_name = ?,
                last_name = ?,
                phone_number = ?,
                email = ?,
                is_active = ?
            WHERE doctor_id = ?
            """;

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, doctor.getFirstName());
            preparedStatement.setString(2, doctor.getLastName());
            preparedStatement.setString(3, doctor.getPhoneNumber());
            preparedStatement.setString(4, doctor.getEmail());
            preparedStatement.setBoolean(5, doctor.isActive());
            preparedStatement.setInt(6, doctor.getDoctorId());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean deleteDoctor(int doctorId) {
        String sql = "DELETE FROM doctors WHERE doctor_id = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, doctorId);

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}
