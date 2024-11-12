package com.example.EmployeesPerformanceSystem.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "trainings")
public class Training {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    @Column(name = "training_date", nullable = false)
    private Date trainingDate;

    @Column(name = "training_topic", nullable = false)
    private String trainingTopic;

    // Additional fields, constructors, getters, and setters can be added here
}