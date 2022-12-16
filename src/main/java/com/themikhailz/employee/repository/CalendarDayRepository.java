package com.themikhailz.employee.repository;

import com.themikhailz.employee.model.CalendarDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface CalendarDayRepository extends JpaRepository<CalendarDay, Integer>, QuerydslPredicateExecutor<CalendarDay> {
}
