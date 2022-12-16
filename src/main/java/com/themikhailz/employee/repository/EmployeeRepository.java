package com.themikhailz.employee.repository;

import com.themikhailz.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>, QuerydslPredicateExecutor<Employee> {
}
