package com.themikhailz.employee.service.employee;

import com.querydsl.core.types.Predicate;
import com.themikhailz.employee.model.Employee;
import com.themikhailz.employee.repository.EmployeeRepository;
import com.themikhailz.employee.service.employee.EmployeeService;
import com.themikhailz.employee.service.employee.argument.CreateEmployeeArgument;
import com.themikhailz.employee.service.employee.argument.SearchEmployeeArgument;
import com.themikhailz.employee.service.employee.argument.UpdateEmployeeArgument;
import com.themikhailz.employee.util.QPredicates;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository repository;

    @Override
    public Employee create(@NonNull CreateEmployeeArgument argument) {
        return null;
    }

    @Override
    public Employee update(@NonNull UpdateEmployeeArgument argument) {
        return null;
    }

    @Override
    public List<Employee> getList(@NonNull SearchEmployeeArgument argument) {
        return null;
    }

    @Override
    public Employee getExisting(@NonNull Integer id) {
        return null;
    }

    private Predicate buildPredicate(SearchEmployeeArgument argument){
        QPredicates predicates = QPredicates.builder();

        return predicates.buildAnd();
    }
}
