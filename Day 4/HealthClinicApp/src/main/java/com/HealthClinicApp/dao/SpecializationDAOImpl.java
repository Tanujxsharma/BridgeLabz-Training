package com.HealthClinicApp.dao;

import com.HealthClinicApp.config.DatabaseConnection;
import com.HealthClinicApp.dto.Specialization;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SpecializationDAOImpl implements SpecializationDAO{
    @Override
    public int addSpecialization(Specialization specialization) {

        String sql = """
            INSERT INTO specializations(name, description)
            VALUES (?, ?)
            """;

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement =
                     connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            preparedStatement.setString(1, specialization.getName());
            preparedStatement.setString(2, specialization.getDescription());

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
    public Specialization getSpecializationById(int specializationId) {

        String sql = "SELECT * FROM specializations WHERE specialization_id = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, specializationId);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {

                Specialization specialization = new Specialization();

                specialization.setSpecializationId(resultSet.getInt("specialization_id"));
                specialization.setName(resultSet.getString("name"));
                specialization.setDescription(resultSet.getString("description"));

                return specialization;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<Specialization> getAllSpecializations() {

        List<Specialization> specializations = new ArrayList<>();

        String sql = "SELECT * FROM specializations";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {

                Specialization specialization = new Specialization();

                specialization.setSpecializationId(resultSet.getInt("specialization_id"));
                specialization.setName(resultSet.getString("name"));
                specialization.setDescription(resultSet.getString("description"));

                specializations.add(specialization);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return specializations;
    }

    @Override
    public boolean updateSpecialization(Specialization specialization) {

        String sql = """
            UPDATE specializations
            SET name = ?, description = ?
            WHERE specialization_id = ?
            """;

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, specialization.getName());
            preparedStatement.setString(2, specialization.getDescription());
            preparedStatement.setInt(3, specialization.getSpecializationId());

            return preparedStatement.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean deleteSpecialization(int specializationId) {

        String sql = "DELETE FROM specializations WHERE specialization_id = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, specializationId);

            return preparedStatement.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}
