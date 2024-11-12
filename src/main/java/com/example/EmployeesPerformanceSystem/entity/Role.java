package com.example.EmployeesPerformanceSystem.entity;


import lombok.Data;

import java.util.List;

import javax.persistence.*;

@Data
@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "role_name", nullable = false)
    private String roleName;

    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
    private List<Employee> employees;

    // Additional fields, constructors, getters, and setters can be added here
}