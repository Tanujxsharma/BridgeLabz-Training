package com.employeePayRoll.service;

import com.employeePayRoll.dto.requestDto;
import com.employeePayRoll.dto.responseDto;
import com.employeePayRoll.entity.Employee;
import com.employeePayRoll.exception.EmployeeNotFoundException;
import com.employeePayRoll.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    public List<responseDto> getAllEmployees() {

        log.info("Fetching all employees");

        return employeeRepository.findAll()
                .stream()
                .map(this::mapToResponseDto)
                .toList();
    }

    @Override
    public responseDto getEmployeeById(Long id) {

        log.info("Fetching employee with id: {}", id);

        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> {
                    log.warn("Employee not found with id: {}", id);
                    return new EmployeeNotFoundException(id);
                });

        return mapToResponseDto(employee);
    }

    @Override
    public responseDto createEmployee(requestDto request) {

        log.info("Creating employee: {}", request.getName());

        Employee employee = mapToEntity(request);

        Employee savedEmployee = employeeRepository.save(employee);

        return mapToResponseDto(savedEmployee);
    }

    @Override
    public responseDto updateEmployee(Long id, requestDto request) {

        log.info("Updating employee with id: {}", id);

        Employee existing = employeeRepository.findById(id)
                .orElseThrow(() -> {
                    log.warn(
                            "Cannot update — employee not found with id: {}",
                            id
                    );
                    return new EmployeeNotFoundException(id);
                });

        existing.setName(request.getName());
        existing.setDepartment(request.getDepartment());
        existing.setSalary(request.getSalary());

        Employee updatedEmployee = employeeRepository.save(existing);

        return mapToResponseDto(updatedEmployee);
    }

    @Override
    public void deleteEmployee(Long id) {

        log.info("Deleting employee with id: {}", id);

        if (!employeeRepository.existsById(id)) {
            log.warn(
                    "Cannot delete — employee not found with id: {}",
                    id
            );

            throw new EmployeeNotFoundException(id);
        }

        employeeRepository.deleteById(id);

        log.info("Employee deleted with id: {}", id);
    }

    // Request DTO -> Entity
    private Employee mapToEntity(requestDto request) {

        Employee employee = new Employee();

        employee.setName(request.getName());
        employee.setDepartment(request.getDepartment());
        employee.setSalary(request.getSalary());

        return employee;
    }

    // Entity -> Response DTO
    private responseDto mapToResponseDto(Employee employee) {

        return responseDto.builder()
                .id(employee.getId())
                .name(employee.getName())
                .department(employee.getDepartment())
                .salary(employee.getSalary())
                .build();
    }
}