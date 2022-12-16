package com.themikhailz.employee.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Embedded
    private Person person;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String post;

    @Column(nullable = false)
    private Integer salary;

    @Column(nullable = false)
    private Integer workdayHours;

    @OneToMany(mappedBy = "employee")
    private List<EmployeeWorkingDay> workingDays;

    private LocalDateTime createTime;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id.equals(employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
