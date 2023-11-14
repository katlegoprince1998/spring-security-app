package com.codeworld.springsecurity.service;

import com.codeworld.springsecurity.entity.Employee;
import com.codeworld.springsecurity.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImplementation implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public List<Employee> getAllEmp() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmpById(Long employeeId) {
        return employeeRepository.findById(employeeId).get();
    }
}
