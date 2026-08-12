package com.collage.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentResponseDto {

    private Integer studentId;

    private String rollNumber;

    private String firstName;

    private String lastName;

    private String gender ;

    private String email ;

    private String course;

    private String department;
}
