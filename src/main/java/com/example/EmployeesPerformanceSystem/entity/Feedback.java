package com.example.EmployeesPerformanceSystem.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "feedbacks")
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    @Column(name = "feedback_date", nullable = false)
    private Date feedbackDate;

    @Column(name = "comments")
    private String comments;

    // Additional fields, constructors, getters, and setters can be added here
}