package com.example.EmployeesPerformanceSystem.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "performance_reviews")
public class PerformanceReview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    @Column(name = "review_date", nullable = false)
    private Date reviewDate;

    @Column(name = "score", nullable = false)
    private int score;

    @Column(name = "comments")
    private String comments;

    // Additional fields, constructors, getters, and setters can be added here
}