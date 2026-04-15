package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "recruiters")
@Getter
@Setter
@NoArgsConstructor
public class Recruiter {

    @Id
    private String id; 

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(name = "company_name")
    private String companyName;
}