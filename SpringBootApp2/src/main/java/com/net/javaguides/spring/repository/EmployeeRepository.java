package com.net.javaguides.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.net.javaguides.spring.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>
{

}
