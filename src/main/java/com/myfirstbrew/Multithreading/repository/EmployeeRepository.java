package com.myfirstbrew.Multithreading.repository;

import com.myfirstbrew.Multithreading.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
