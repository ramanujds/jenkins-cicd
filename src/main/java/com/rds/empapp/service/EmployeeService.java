package com.rds.empapp.service;

import com.rds.empapp.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {
    public Employee saveEmployee(Employee employee);
    public Employee updateEmployee(Employee employee);
    public Employee getEmployeeById(int id);
    public void deleteEmployeeById(int id);
    public List<Employee> getAllEmployees();

}
