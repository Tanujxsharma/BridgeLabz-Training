package com.HealthClinicApp.dto;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;
@Data
public class Billing {

    private int billId;
    private int appointmentId;
    private BigDecimal amount;
    private String paymentStatus;
    private Timestamp billingDate;

    public Billing() {
    }

    public Billing(int appointmentId,
                   BigDecimal amount,
                   String paymentStatus) {

        this.appointmentId = appointmentId;
        this.amount = amount;
        this.paymentStatus = paymentStatus;
    }

}
