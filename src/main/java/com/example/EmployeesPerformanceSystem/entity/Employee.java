package com.example.EmployeesPerformanceSystem.entity;

import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "employees")
public class Employee {

    // Primary Key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Employee Name
    @Column(name = "name", nullable = false)
    private String name;

    // Employee Email - Unique and Non-Nullable
    @Column(name = "email", unique = true, nullable = false)
    private String email;

    // Many Employees can belong to one Department
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

    // One Employee can have multiple Performance Reviews
    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<PerformanceReview> performanceReviews;

    // Default Constructor
    public Employee() {
    }

    // Parameterized Constructor
    public Employee(String name, String email, Department department) {
        this.name = name;
        this.email = email;
        this.department = department;
    }

	public void setEmail(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setDepartment(Department department2) {
		// TODO Auto-generated method stub
		
	}

	public char[] getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

    // Additional constructors, methods, or business logic can be added as needed

}
