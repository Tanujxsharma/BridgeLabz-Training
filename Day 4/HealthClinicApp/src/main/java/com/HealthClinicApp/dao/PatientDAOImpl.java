package com.HealthClinicApp.dao;

import com.HealthClinicApp.config.DatabaseConnection;
import com.HealthClinicApp.dto.Patient;
import lombok.Data;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PatientDAOImpl implements PatientDAO{

    @Override
    public int addPatient(Patient patient) {
        String sql = """
                INSERT INTO patients
                (first_name,last_name,date_of_birth,gender,phone_number,email,is_active)
                VALUES (?,?,?,?,?,?,?)
                """;
        try(Connection connection = DatabaseConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            preparedStatement.setString(1, patient.getFirstName());
            preparedStatement.setString(2, patient.getLastName());
            preparedStatement.setDate(3, patient.getDateOfBirth());
            preparedStatement.setString(4, patient.getGender());
            preparedStatement.setString(5, patient.getPhoneNumber());
            preparedStatement.setString(6, patient.getEmail());
            preparedStatement.setBoolean(7, patient.isActive());

            int rowsAffected = preparedStatement.executeUpdate();
            if(rowsAffected>0){
                ResultSet resultSet = preparedStatement.getGeneratedKeys();
                if (resultSet.next()) {
                    return resultSet.getInt(1);
                }
            }


        }catch(SQLException e){
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public Patient getPatientById(int patientId) {

        String sql = "SELECT * FROM patients WHERE  patient_id = ?";

        try(Connection connection = DatabaseConnection.getConnection();
        PreparedStatement preparedStatement =connection.prepareStatement(sql)
        ){
            preparedStatement.setInt(1,patientId);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {

                Patient patient = new Patient();

                patient.setPatientId(resultSet.getInt("patient_id"));
                patient.setFirstName(resultSet.getString("first_name"));
                patient.setLastName(resultSet.getString("last_name"));
                patient.setDateOfBirth(resultSet.getDate("date_of_birth"));
                patient.setGender(resultSet.getString("gender"));
                patient.setPhoneNumber(resultSet.getString("phone_number"));
                patient.setEmail(resultSet.getString("email"));
                patient.setActive(resultSet.getBoolean("is_active"));

                return patient;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Patient> getAllPatient() {

        List<Patient> patients = new ArrayList<>();
        String sql = "SELECT * FROM patients";
        try(Connection connection = DatabaseConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery()
        ){
            while(resultSet.next()){
                Patient patient = new Patient();

                patient.setPatientId(resultSet.getInt("patient_id"));
                patient.setFirstName(resultSet.getString("first_name"));
                patient.setLastName(resultSet.getString("last_name"));
                patient.setDateOfBirth(resultSet.getDate("date_of_birth"));
                patient.setGender(resultSet.getString("gender"));
                patient.setPhoneNumber(resultSet.getString("phone_number"));
                patient.setEmail(resultSet.getString("email"));
                patient.setActive(resultSet.getBoolean("is_active"));

                patients.add(patient);
            }

        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return patients;
    }

    @Override
    public boolean updatePatient(Patient patient) {

        String sql = """
            UPDATE patients
            SET first_name = ?,
                last_name = ?,
                date_of_birth = ?,
                gender = ?,
                phone_number = ?,
                email = ?,
                is_active = ?
            WHERE patient_id = ?
            """;

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, patient.getFirstName());
            preparedStatement.setString(2, patient.getLastName());
            preparedStatement.setDate(3, patient.getDateOfBirth());
            preparedStatement.setString(4, patient.getGender());
            preparedStatement.setString(5, patient.getPhoneNumber());
            preparedStatement.setString(6, patient.getEmail());
            preparedStatement.setBoolean(7, patient.isActive());

            preparedStatement.setInt(8, patient.getPatientId());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean deletePatient(int patientId) {
        String sql = "DELETE FROM patients WHERE patient_id = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, patientId);

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
