package com.EmployeeManagement.project;

import org.springframework.stereotype.Component;

@Component
record Employee(int employeeId,
                String eeName,
                double salary,
                String businessUnit,
                int age) {
    @Override
    public String toString() {
        return "Employee details \n"+
                "=======================================\n"+
                "Employee Id : " + employeeId + "\n" +
                "Employee Name : " + eeName + "\n" +
                "Employee salary : " + salary + "\n" +
                "Employee BU : " + businessUnit + "\n" +
                "Employee age : " + age;
    }
}
