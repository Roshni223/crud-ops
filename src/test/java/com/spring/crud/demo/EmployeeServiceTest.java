package com.spring.crud.demo;

import com.spring.crud.demo.model.emp.Employee;
import com.spring.crud.demo.repository.EmployeeRepository;
import com.spring.crud.demo.service.EmployeeService;

import com.spring.crud.demo.service.impl.EmployeeServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTest {

    @Mock
    private EmployeeRepository employeeRepository;

    @InjectMocks
    private EmployeeServiceImpl employeeService;

    @Test
    public void addEmployeeTest(){

        Employee employee = new Employee();
        employee.setId(1);
        employee.setFirstName("Ravi");

        Mockito.when(employeeRepository.save(employee)).thenReturn(employee);

        Employee addedEmployee = employeeService.save(employee);

        Assertions.assertEquals(1, addedEmployee.getId());
    }
}