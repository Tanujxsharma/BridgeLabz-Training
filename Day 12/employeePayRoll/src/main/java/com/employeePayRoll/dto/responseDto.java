package com.employeePayRoll.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class responseDto {
    private Long id;

    private String name;

    private String department;

    private BigDecimal salary;
}
