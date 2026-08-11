package com.contactApp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "email",nullable = false , unique = true)
    private String email;
    @Column(name = "name",nullable = false , unique = true)
    private String name;
    @Column(name ="mobile_number ",nullable = false , unique = true)
    private String phone;

}
