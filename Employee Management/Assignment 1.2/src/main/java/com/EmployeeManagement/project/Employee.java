package com.EmployeeManagement.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
record Employee(int employeeId,
                String eeName,
                double salary,
                @Autowired
                SBU businessUnit,
                int age) {

    @Override
    public String toString() {
        return "Employee details \n"+
                "=======================================\n"+
                "Employee[" +
                "employeeId=" + employeeId +
                ", eeName='" + eeName + '\'' +
                ", salary=" + salary +
                ",\nbusinessUnit=" + businessUnit +
                ", age=" + age +
                ']';
    }
}
