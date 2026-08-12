package com.collage.controller;

import com.collage.dto.StudentRequestDto;
import com.collage.dto.StudentResponseDto;
import com.collage.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @PostMapping("/addStudent")
    public ResponseEntity<StudentResponseDto> addStudent(
            @RequestBody StudentRequestDto requestDto
            ){
        StudentResponseDto responseDto = studentService.addStudent(requestDto);
        return new ResponseEntity<>(responseDto, HttpStatus.CREATED);
    }
    @GetMapping("/getStudents")
    public ResponseEntity<List<StudentResponseDto>> getStudents(){
        return ResponseEntity.ok(studentService.getAllStudent());
    }


}
