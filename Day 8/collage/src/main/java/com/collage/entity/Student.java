package com.collage.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "students")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer  studentId;

    @Column(name =" roll_number" , nullable = false ,unique = true)
    private String rollNumber;

    @Column(name = "first_name" ,nullable = false)
    private String firstName;

    @Column(name ="last_name", nullable = false)
    private String lastName;

    @Column (name = "gender" , nullable = false)
    private String gender ;

    @Column(name = "email" , nullable = false , unique = true)
    private String email ;

    @Column(name ="course" ,nullable = false)
    private String course;

    @Column(name = "department" , nullable = false)
    private String department;


}
