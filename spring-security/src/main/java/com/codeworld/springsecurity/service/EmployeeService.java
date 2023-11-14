package com.codeworld.springsecurity.service;

import com.codeworld.springsecurity.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmp();
    Employee getEmpById(Long employeeId);

}
