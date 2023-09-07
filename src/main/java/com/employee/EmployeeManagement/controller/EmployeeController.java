package com.employee.EmployeeManagement.controller;

import com.employee.EmployeeManagement.model.Employee;
import com.employee.EmployeeManagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/allEmployees")
    public List<Employee> fetchAllEmployees(){
       return employeeService.fetchAllEmployees();
    }
}
