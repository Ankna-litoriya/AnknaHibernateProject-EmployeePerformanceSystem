package com.example.EmployeesPerformanceSystem.main;

import com.example.EmployeesPerformanceSystem.dao.EmployeeDAO;
import com.example.EmployeesPerformanceSystem.dao.SkillDAO;
import com.example.EmployeesPerformanceSystem.entity.Employee;
import com.example.EmployeesPerformanceSystem.entity.Department;
import com.example.EmployeesPerformanceSystem.entity.Skill;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        SkillDAO skillDAO = new SkillDAO();

        try {
            // Create a new department
            Department department = new Department();
            department.setName("Human Resources");

            // Create a new employee
            Employee employee = new Employee();
            employee.setName("John Doe");
            employee.setEmail("john.doe@example.com");
            employee.setDepartment(department);

            // Save the employee
            employeeDAO.save(employee);

            // Create a new skill
            Skill skill = new Skill();
            skill.setSkillName("Communication");
            skill.setEmployee(employee);

            // Save the skill
            skillDAO.save(skill);

            // Retrieve all skills
            List<Skill> skills = skillDAO.getAll();
            for (Skill sk : skills) {
                System.out.println(sk.getSkillName());
            }

            // Update skill
            skill.setSkillName("Advanced Communication");
            skillDAO.update(skill);

            // Delete skill
            skillDAO.delete(skill.getId());

            // Retrieve all employees
            List<Employee> employees = employeeDAO.getAll();
            for (Employee emp : employees) {
                System.out.println(emp.getName());
            }

            // Clean up
            employeeDAO.delete(employee.getId());
        } catch (Exception e) {
            e.printStackTrace(); // Log the exception
        }
    }
}