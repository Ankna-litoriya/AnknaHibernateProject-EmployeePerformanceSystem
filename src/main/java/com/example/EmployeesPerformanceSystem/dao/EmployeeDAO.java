package com.example.EmployeesPerformanceSystem.dao;


import com.example.EmployeesPerformanceSystem.entity.Employee;
import com.example.EmployeesPerformanceSystem.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class EmployeeDAO {
    public void save(Employee employee) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(employee);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback(); // Rollback the transaction if an error occurs
            }
            e.printStackTrace(); // Log the exception
        }
    }

    public Employee getById(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Employee.class, id);
        }
    }

    public List<Employee> getAll() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Employee", Employee.class).list();
        }
    }

    public void update(Employee employee) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(employee);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback(); // Rollback the transaction if an error occurs
            }
            e.printStackTrace(); // Log the exception
        }
    }

    public void delete(Long id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Employee employee = session.get(Employee.class, id);
            if (employee != null) {
                session.delete(employee);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback(); // Rollback the transaction if an error occurs
            }
            e.printStackTrace(); // Log the exception
        }
    }
}