package com.themikhailz.employee.exception;

import lombok.NonNull;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(String message) {
        super(message);
    }
}
