package com.themikhailz.employee.service.employee;

import com.google.common.collect.Lists;
import com.querydsl.core.types.Predicate;
import com.themikhailz.employee.exception.EmployeeNotFoundException;
import com.themikhailz.employee.model.Employee;
import com.themikhailz.employee.model.QEmployee;
import com.themikhailz.employee.repository.EmployeeRepository;
import com.themikhailz.employee.service.employee.argument.CreateEmployeeArgument;
import com.themikhailz.employee.service.employee.argument.SearchEmployeeArgument;
import com.themikhailz.employee.service.employee.argument.UpdateEmployeeArgument;
import com.themikhailz.employee.util.QPredicates;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository repository;

    @Override
    public Employee create(@NonNull CreateEmployeeArgument argument) {
        return repository.save(Employee.builder()
                                       .person(argument.getPerson())
                                       .phoneNumber(argument.getPhoneNumber())
                                       .post(argument.getPost())
                                       .salary(argument.getSalary())
                                       .workdayHours(argument.getWorkdayHours())
                                       .workingDays(new ArrayList<>())
                                       .createTime(LocalDateTime.now())
                                       .build());
    }

    @Override
    public Employee update(@NonNull UpdateEmployeeArgument argument, @NonNull Integer employeeId) {
        Employee employee = getExisting(employeeId);

        employee.setPerson(argument.getPerson());
        employee.setPhoneNumber(argument.getPhoneNumber());
        employee.setPost(argument.getPost());
        employee.setSalary(argument.getSalary());
        employee.setWorkdayHours(argument.getWorkdayHours());

        return repository.save(employee);
    }

    @Override
    public List<Employee> getList(@NonNull SearchEmployeeArgument argument) {
        Predicate predicate = buildPredicate(argument);

        return Lists.newArrayList(repository.findAll(predicate));
    }

    @Override
    public Employee getExisting(@NonNull Integer id) {
        return repository.findById(id).orElseThrow(() -> new EmployeeNotFoundException(String.format("Employee with this id:%d is not found", id)));
    }

    private Predicate buildPredicate(SearchEmployeeArgument argument) {
        QEmployee qEmployee = QEmployee.employee;

        QPredicates predicates = QPredicates.builder()
                                            .add(argument.getFirstName(), qEmployee.person.firstName::containsIgnoreCase)
                                            .add(argument.getLastName(), qEmployee.person.lastName::containsIgnoreCase)
                                            .add(argument.getMiddleName(), qEmployee.person.middleName::containsIgnoreCase)
                                            .add(argument.getPhoneNumber(), qEmployee.phoneNumber::containsIgnoreCase)
                                            .add(argument.getPost(), qEmployee.post::containsIgnoreCase)
                                            .add(argument.getSalary(), qEmployee.salary::eq);

        return predicates.buildAnd();
    }
}
