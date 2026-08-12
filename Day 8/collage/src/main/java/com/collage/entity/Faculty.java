package com.collage.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "faculty")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Faculty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int facultyId;
    @Column(name ="first_name" , nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable =false)
    private String lastName;
    @Column(name="gender" , nullable = false)
    private String gender ;
    @Column(name = "email", nullable = false)
    private String email ;
    @Column(name = "department", nullable = false)
    private String department ;
    @Column(name="salary " , nullable = false)
    private Long salary;
}
