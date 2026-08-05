package com.HealthClinicApp.dao;

import com.HealthClinicApp.dto.VisitHistory;

import java.util.List;

public interface VisitHistoryDAO {

    int addVisitHistory(VisitHistory visitHistory);

    VisitHistory getVisitHistoryById(int visitId);

    List<VisitHistory> getAllVisitHistories();

    boolean updateVisitHistory(VisitHistory visitHistory);

    boolean deleteVisitHistory(int visitId);
}
