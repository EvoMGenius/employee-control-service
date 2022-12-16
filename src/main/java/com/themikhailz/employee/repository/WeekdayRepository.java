package com.themikhailz.employee.repository;

import com.themikhailz.employee.model.Weekday;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface WeekdayRepository extends JpaRepository<Weekday, Integer>, QuerydslPredicateExecutor<Weekday> {
}
