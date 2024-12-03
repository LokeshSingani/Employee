package com.employee.services;

import java.util.List;

import com.employee.entities.Employee;

public interface EmployeeService {

    String addEmployee(Employee employee);

    Employee searchEmployee(Long id);  // assuming 'Long' is the ID type for Employee

    String updateEmployee(Employee employee);

    String deleteEmployee(Long id);  // assuming 'Long' is the ID type for Employee

    List<Employee> fetchAllEmployees();

    String deleteAllEmployees();
}
