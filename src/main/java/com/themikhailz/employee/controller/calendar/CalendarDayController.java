package com.themikhailz.employee.controller.calendar;

import com.themikhailz.employee.service.calendar.CalendarDayService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calendar")
@RequiredArgsConstructor
public class CalendarDayController {

    private final CalendarDayService service;
}
