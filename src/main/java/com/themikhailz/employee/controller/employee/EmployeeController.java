package com.themikhailz.employee.controller.employee;

import com.themikhailz.employee.controller.employee.dto.EmployeeDto;
import com.themikhailz.employee.controller.employee.dto.SearchEmployeeDto;
import com.themikhailz.employee.service.employee.EmployeeService;
import com.themikhailz.employee.service.employee.argument.SearchEmployeeArgument;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService service;

    private final EmployeeMapper mapper;

    @GetMapping("list")
    public List<EmployeeDto> getList(@RequestParam SearchEmployeeDto dto) {
        SearchEmployeeArgument argument = mapper.toSearchArgument(dto);
        return service.getList(argument).stream()
                      .map(mapper::toDto)
                      .collect(Collectors.toList());
    }

}
