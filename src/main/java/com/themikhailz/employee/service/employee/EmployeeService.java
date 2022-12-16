package com.themikhailz.employee.service.employee;

import com.themikhailz.employee.model.Employee;
import com.themikhailz.employee.service.employee.argument.CreateEmployeeArgument;
import com.themikhailz.employee.service.employee.argument.SearchEmployeeArgument;
import com.themikhailz.employee.service.employee.argument.UpdateEmployeeArgument;
import lombok.NonNull;

import java.util.List;

public interface EmployeeService {

    Employee create(@NonNull CreateEmployeeArgument argument);

    Employee update(@NonNull UpdateEmployeeArgument argument);

    List<Employee> getList(@NonNull SearchEmployeeArgument argument);

    Employee getExisting(@NonNull Integer id);
}
