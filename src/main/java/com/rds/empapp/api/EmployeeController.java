package com.rds.empapp.api;

import com.rds.empapp.model.Employee;
import com.rds.empapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @PostMapping("/employees")
    public Employee saveEmployee(Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @PutMapping
    public Employee updateEmployee(Employee employee){
        return employeeService.updateEmployee(employee);
    }

   // create a delete mapping
    @DeleteMapping("/employees/{id}")
   public void deleteEmployee(@PathVariable int id){
        employeeService.deleteEmployeeById(id);
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        return employeeService.getEmployeeById(id);
    }







}
