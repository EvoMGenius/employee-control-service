package com.themikhailz.employee.service.employee.argument;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class SearchEmployeeArgument {

    String firstName;

    String lastName;

    String middleName;

    String phoneNumber;

    String post;

    Integer salary;
}
