package com.themikhailz.employee.controller.weekday;

import com.themikhailz.employee.service.weekday.WeekdayService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("weekday")
@RequiredArgsConstructor
public class WeekdayController {

    private final WeekdayService service;
}
