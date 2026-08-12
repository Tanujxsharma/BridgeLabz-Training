package com.collage.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentRequestDto {
    private String rollNumber;

    private String firstName;

    private String lastName;

    private String gender ;

    private String email ;

    private String course;

    private String department;
}
