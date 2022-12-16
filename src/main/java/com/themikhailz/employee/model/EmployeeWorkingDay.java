package com.themikhailz.employee.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeWorkingDay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDateTime start;

    private LocalDateTime finish;

    @ManyToOne(optional = false)
    @JoinColumn(name = "weekday_id", nullable = false)
    private Weekday weekday;

    @ManyToOne(optional = false)
    private Employee employee;

}
