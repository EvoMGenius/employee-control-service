package com.themikhailz.employee.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Cascade;

import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Weekday {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @OneToMany(mappedBy = "weekday")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<CalendarDay> calendarDays;

    @OneToMany(mappedBy = "weekday")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<EmployeeWorkingDay> employeeWorkingDays;
}
