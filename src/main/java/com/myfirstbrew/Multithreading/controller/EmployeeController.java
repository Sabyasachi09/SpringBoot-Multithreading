package com.myfirstbrew.Multithreading.controller;

import com.myfirstbrew.Multithreading.entity.Employee;
import com.myfirstbrew.Multithreading.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employee")
    public ResponseEntity<List<Employee>> getAllEmployees(){
        return ResponseEntity.ok().body( employeeService.getAll());
    }

}
