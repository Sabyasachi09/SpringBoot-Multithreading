package com.myfirstbrew.Multithreading.serviceImpl;

import com.myfirstbrew.Multithreading.entity.Employee;
import com.myfirstbrew.Multithreading.repository.EmployeeRepository;
import com.myfirstbrew.Multithreading.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getAll() {
        return Optional.of(employeeRepository.findAll()).orElseThrow();
//        return employeeRepository.findAll();
    }
}
