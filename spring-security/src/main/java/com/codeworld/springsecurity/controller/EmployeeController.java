package com.codeworld.springsecurity.controller;

import com.codeworld.springsecurity.entity.Employee;
import com.codeworld.springsecurity.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/")
    public String landingPage(){
        return "Welcome to spring security, I built a simple API with Implemented" +
                " spring security. The API consists of two end points, you can access " +
                "  employees or access individual employees using their ID. The aim of" +
                " this project is to understand spring security.";
    }
    @GetMapping("/employees")
    public List<Employee> getAllEmp(){
        return employeeService.getAllEmp();
    }
    @GetMapping("/employee/{id}")
    public Employee getEmpById(@PathVariable("id") Long employeeId){
       return employeeService.getEmpById(employeeId);
    }

}
