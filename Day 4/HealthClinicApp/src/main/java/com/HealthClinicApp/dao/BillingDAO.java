package com.HealthClinicApp.dao;

import com.HealthClinicApp.dto.Billing;

import java.util.List;

public interface BillingDAO {
    int addBilling(Billing billing);

    Billing getBillingById(int billId);

    List<Billing> getAllBillings();

    boolean updateBilling(Billing billing);

    boolean deleteBilling(int billId);
}
