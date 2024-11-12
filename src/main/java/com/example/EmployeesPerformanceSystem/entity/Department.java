package com.example.EmployeesPerformanceSystem.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private List<Employee> employees;

	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}

    // Additional fields, constructors, getters, and setters can be added here
}