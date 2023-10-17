package com.rds.empapp.service;

import com.rds.empapp.model.Employee;
import com.rds.empapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;
    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
    public Employee updateEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
    public Employee getEmployeeById(int id){
        return employeeRepository.findById(id).get();
    }
    public void deleteEmployeeById(int id){
        employeeRepository.deleteById(id);
    }
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

}
