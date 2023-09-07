package com.employee.EmployeeManagement.service;

import com.employee.EmployeeManagement.model.Employee;
import com.employee.EmployeeManagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> fetchAllEmployees(){
       return employeeRepository.findAll();
    }
}
