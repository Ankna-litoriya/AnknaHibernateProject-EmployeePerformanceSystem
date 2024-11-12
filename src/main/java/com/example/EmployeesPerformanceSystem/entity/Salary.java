package com.example.EmployeesPerformanceSystem.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "salaries")
public class Salary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "amount", nullable = false)
    private double amount;

    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    // Additional fields, constructors, getters, and setters can be added here
}