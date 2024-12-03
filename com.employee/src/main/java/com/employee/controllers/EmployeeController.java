package com.employee.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;  // <-- Import for PostMapping

import com.employee.entities.Employee;
import com.employee.services.EmployeeService;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService service;

    // Endpoint to add a new employee
    @PostMapping("/addEmployee")
    public String addEmployee(@ModelAttribute Employee employee) {
        service.addEmployee(employee);
        return "Employee added successfully";
    }

    // Endpoint to search an employee by ID
    @GetMapping("/searchEmployee")
    public Employee searchEmployee(@RequestParam Long id) {
        return service.searchEmployee(id);
    }

    // Endpoint to update an existing employee's information
    @PostMapping("/updateEmployee")
    public String updateEmployee(@ModelAttribute Employee employee) {
        service.updateEmployee(employee);
        return "Employee updated successfully";
    }

    // Endpoint to delete a specific employee by ID
    @GetMapping("/deleteEmployee")
    public String deleteEmployee(@RequestParam Long id) {
        service.deleteEmployee(id);
        return "Employee deleted successfully";
    }

    // Endpoint to fetch all employees
    @GetMapping("/fetchAllEmployees")
    public List<Employee> fetchAllEmployees() {
        return service.fetchAllEmployees();
    }

    // Endpoint to delete all employees
    @GetMapping("/deleteAllEmployees")
    public String deleteAllEmployees() {
        service.deleteAllEmployees();
        return "All employees deleted successfully";
    }
}
