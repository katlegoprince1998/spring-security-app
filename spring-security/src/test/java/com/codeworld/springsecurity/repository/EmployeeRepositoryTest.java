package com.codeworld.springsecurity.repository;

import com.codeworld.springsecurity.entity.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest

class EmployeeRepositoryTest {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void saveEmployee(){
        Employee employee = Employee.builder()
                .firstname("Monica")
                .lastname("Maphanga")
                .email("maphanga@gmail.com")
                .build();

         employeeRepository.save(employee);
    }

}