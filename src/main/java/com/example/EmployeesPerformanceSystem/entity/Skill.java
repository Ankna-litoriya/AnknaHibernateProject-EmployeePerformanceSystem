package com.example.EmployeesPerformanceSystem.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "skills")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "skill_name", nullable = false)
    private String skillName;

    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

	public void setSkillName(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setEmployee(Employee employee2) {
		// TODO Auto-generated method stub
		
	}

	public char[] getSkillName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

    // Additional fields, constructors, getters, and setters can be added here
}