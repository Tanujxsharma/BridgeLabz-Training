package com.collage.service;

import com.collage.dto.StudentRequestDto;
import com.collage.dto.StudentResponseDto;

import java.util.List;

public interface StudentService {
    public StudentResponseDto addStudent(StudentRequestDto requestDto);
    public List<StudentResponseDto> getAllStudent();

}
