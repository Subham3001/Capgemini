package com.EmployeeManagement.project;

import org.springframework.stereotype.Component;

@Component
record Employee(int employeeId,
                String eeName,
                double salary) {

    @Override
    public String toString() {
        return "Employee[" +
                "employeeId=" + employeeId +
                ", eeName='" + eeName + '\'' +
                ", salary=" + salary +
                ']';
    }
}
