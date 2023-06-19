package com.example.EmployeeRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Employee.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
