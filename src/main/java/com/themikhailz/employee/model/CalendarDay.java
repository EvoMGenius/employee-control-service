package com.themikhailz.employee.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CalendarDay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (name ="day_date")
    private Date dayDate;

    @Column(name = "is_holiday")
    private Boolean isHoliday;

    @ManyToOne(optional = false)
    @JoinColumn(name = "weekday_id", nullable = false)
    private Weekday weekday;
}
