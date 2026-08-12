package com.collage.service;

import com.collage.dto.StudentRequestDto;
import com.collage.dto.StudentResponseDto;
import com.collage.entity.Student;
import com.collage.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public StudentResponseDto addStudent(StudentRequestDto requestDto) {

        Student student;
        student = Student.builder()
                .rollNumber(requestDto.getRollNumber())
                .firstName(requestDto.getFirstName())
                .lastName(requestDto.getLastName())
                .gender(requestDto.getGender())
                .email(requestDto.getEmail())
                .course(requestDto.getCourse())
                .department(requestDto.getDepartment())
                .build();

        Student savedStudent = studentRepository.save(student);
        return convertToStudentResponse(savedStudent);
    }

    @Override
    public List<StudentResponseDto> getAllStudent() {
        return studentRepository.findAll()
                .stream()
                .map(this::convertToStudentResponse)
                .toList();
    }




        private StudentResponseDto convertToStudentResponse( Student student ){
        return StudentResponseDto.builder().studentId(student.getStudentId())
                .rollNumber(student.getRollNumber())
                .firstName(student.getFirstName())
                .lastName(student.getLastName())
                .email(student.getEmail())
                .course(student.getCourse())
                .gender(student.getGender())
                .department(student.getDepartment())
                .build();
    }

}
