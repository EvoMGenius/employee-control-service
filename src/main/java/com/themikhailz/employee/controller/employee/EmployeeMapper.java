package com.themikhailz.employee.controller.employee;

import com.themikhailz.employee.controller.employee.dto.EmployeeDto;
import com.themikhailz.employee.controller.employee.dto.SearchEmployeeDto;
import com.themikhailz.employee.model.Employee;
import com.themikhailz.employee.service.employee.argument.SearchEmployeeArgument;
import org.mapstruct.Mapper;

@Mapper
public interface EmployeeMapper {


    SearchEmployeeArgument toSearchArgument(SearchEmployeeDto dto);

    EmployeeDto toDto(Employee employee);
}
