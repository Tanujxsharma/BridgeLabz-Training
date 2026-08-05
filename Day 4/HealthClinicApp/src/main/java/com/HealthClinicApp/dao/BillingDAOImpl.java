package com.HealthClinicApp.dao;

import com.HealthClinicApp.config.DatabaseConnection;
import com.HealthClinicApp.dto.Billing;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BillingDAOImpl implements BillingDAO{
    @Override
    public int addBilling(Billing billing) {

        String sql = """
            INSERT INTO billing
            (appointment_id, amount, payment_status)
            VALUES (?, ?, ?)
            """;

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement =
                     connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            preparedStatement.setInt(1, billing.getAppointmentId());
            preparedStatement.setBigDecimal(2, billing.getAmount());
            preparedStatement.setString(3, billing.getPaymentStatus());

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet rs = preparedStatement.getGeneratedKeys();
                if (rs.next()) {
                    return rs.getInt(1);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return -1;
    }

    @Override
    public Billing getBillingById(int billId) {

        String sql = "SELECT * FROM billing WHERE bill_id=?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, billId);

            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {

                Billing billing = new Billing();

                billing.setBillId(rs.getInt("bill_id"));
                billing.setAppointmentId(rs.getInt("appointment_id"));
                billing.setAmount(rs.getBigDecimal("amount"));
                billing.setPaymentStatus(rs.getString("payment_status"));
                billing.setBillingDate(rs.getTimestamp("billing_date"));

                return billing;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<Billing> getAllBillings() {

        List<Billing> list = new ArrayList<>();

        String sql = "SELECT * FROM billing";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet rs = preparedStatement.executeQuery()) {

            while (rs.next()) {

                Billing billing = new Billing();

                billing.setBillId(rs.getInt("bill_id"));
                billing.setAppointmentId(rs.getInt("appointment_id"));
                billing.setAmount(rs.getBigDecimal("amount"));
                billing.setPaymentStatus(rs.getString("payment_status"));
                billing.setBillingDate(rs.getTimestamp("billing_date"));

                list.add(billing);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
    @Override
    public boolean updateBilling(Billing billing) {

        String sql = """
            UPDATE billing
            SET appointment_id=?,
                amount=?,
                payment_status=?
            WHERE bill_id=?
            """;

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, billing.getAppointmentId());
            preparedStatement.setBigDecimal(2, billing.getAmount());
            preparedStatement.setString(3, billing.getPaymentStatus());
            preparedStatement.setInt(4, billing.getBillId());

            return preparedStatement.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean deleteBilling(int billId) {

        String sql = "DELETE FROM billing WHERE bill_id=?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, billId);

            return preparedStatement.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}
