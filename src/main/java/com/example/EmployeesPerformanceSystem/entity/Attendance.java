package com.example.EmployeesPerformanceSystem.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "attendances")
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    @Column(name = "attendance_date", nullable = false)
    private Date attendanceDate;

    @Column(name = "status", nullable = false)
    private String status; // e.g., Present, Absent

    // Additional fields, constructors, getters, and setters can be added here
}