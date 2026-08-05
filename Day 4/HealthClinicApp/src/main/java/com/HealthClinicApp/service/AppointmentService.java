package com.HealthClinicApp.service;

import com.HealthClinicApp.config.DatabaseConnection;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AppointmentService {

    public boolean completeAppointment(int appointmentId,
                                       BigDecimal amount,
                                       String diagnosis,
                                       String prescription,
                                       String visitNotes) {

        Connection connection = null;

        try {


            connection = DatabaseConnection.getConnection();


            connection.setAutoCommit(false);



            String appointmentSql = """
                    UPDATE appointments
                    SET status = 'Completed'
                    WHERE appointment_id = ?
                    """;

            try (PreparedStatement preparedStatement =
                         connection.prepareStatement(appointmentSql)) {

                preparedStatement.setInt(1, appointmentId);

                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected == 0) {

                    connection.rollback();
                    return false;

                }

            }



            String billingSql = """
                    INSERT INTO billing
                    (appointment_id, amount, payment_status)
                    VALUES (?, ?, ?)
                    """;

            try (PreparedStatement preparedStatement =
                         connection.prepareStatement(billingSql)) {

                preparedStatement.setInt(1, appointmentId);
                preparedStatement.setBigDecimal(2, amount);
                preparedStatement.setString(3, "Pending");

                preparedStatement.executeUpdate();

            }



            String visitSql = """
                    INSERT INTO visit_history
                    (appointment_id, diagnosis, prescription, visit_notes)
                    VALUES (?, ?, ?, ?)
                    """;

            try (PreparedStatement preparedStatement =
                         connection.prepareStatement(visitSql)) {

                preparedStatement.setInt(1, appointmentId);
                preparedStatement.setString(2, diagnosis);
                preparedStatement.setString(3, prescription);
                preparedStatement.setString(4, visitNotes);

                preparedStatement.executeUpdate();

            }



            connection.commit();

            return true;

        } catch (SQLException e) {

            // Rollback Transaction
            if (connection != null) {

                try {

                    connection.rollback();

                } catch (SQLException ex) {

                    ex.printStackTrace();

                }

            }

            e.printStackTrace();

            return false;

        } finally {

            if (connection != null) {

                try {

                    connection.setAutoCommit(true);
                    connection.close();

                } catch (SQLException e) {

                    e.printStackTrace();

                }

            }

        }

    }


}
