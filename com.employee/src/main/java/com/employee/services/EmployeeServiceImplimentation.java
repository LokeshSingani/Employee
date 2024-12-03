package com.employee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entities.Employee;
import com.employee.repositories.EmployeeRepository;

@Service
public class EmployeeServiceImplimentation  implements EmployeeService {

    @Autowired
    EmployeeRepository repo;

    // Add a new employee
    @Override
    public String addEmployee(Employee employee) {
        repo.save(employee);
        return "Employee added successfully";
    }

    // Search for an employee by ID
    @Override
    public Employee searchEmployee(Long id) {
        return repo.findById(id).orElse(null);  // Returning null if employee not found
    }

    // Update an existing employee
    @Override
    public String updateEmployee(Employee employee) {
        repo.save(employee);  // Saves the updated employee
        return "Employee updated successfully";
    }

    // Delete an employee by ID
    @Override
    public String deleteEmployee(Long id) {
        repo.deleteById(id);
        return "Employee deleted successfully";
    }

    // Fetch all employees
    @Override
    public List<Employee> fetchAllEmployees() {
        return repo.findAll();
    }

    // Delete all employees
    @Override
    public String deleteAllEmployees() {
        repo.deleteAll();
        return "All employees deleted successfully";
    }
}
