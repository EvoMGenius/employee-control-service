package com.themikhailz.employee.repository;

import com.themikhailz.employee.model.EmployeeWorkingDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface EmployeeWorkingDayRepository extends JpaRepository<EmployeeWorkingDay, Integer>, QuerydslPredicateExecutor<EmployeeWorkingDay> {
}
