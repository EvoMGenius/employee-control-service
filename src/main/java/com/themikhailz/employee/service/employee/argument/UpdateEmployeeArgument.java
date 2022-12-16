package com.themikhailz.employee.service.employee.argument;

import com.themikhailz.employee.model.Person;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class UpdateEmployeeArgument {

    Person person;

    String phoneNumber;

    String post;

    Integer salary;

    Integer workdayHours;

}
