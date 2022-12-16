package com.themikhailz.employee.controller.workingday;

import com.themikhailz.employee.service.workingday.EmployeeWorkingDayService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("workingDay")
public class EmployeeWorkingDayController {

    private final EmployeeWorkingDayService service;
}
