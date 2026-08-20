package com.employeePayRoll.service;

import com.employeePayRoll.dto.requestDto;
import com.employeePayRoll.dto.responseDto;

import java.util.List;

public interface EmployeeService {

    List<responseDto> getAllEmployees();

    responseDto getEmployeeById(Long id);

    responseDto createEmployee(requestDto request);

    responseDto updateEmployee(Long id, requestDto request);

    void deleteEmployee(Long id);
}