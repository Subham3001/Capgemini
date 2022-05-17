package com.EmployeeManagement.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
record SBU(int sbuCode,
           String sbuName,
           String sbuHead,
           @Autowired
           List<Employee> empList){
    @Override
    public String toString() {
        return "SBU details\n" +
                "---------------------------------\n" +
                "sbuCode=" + sbuCode +
                ", sbuName='" + sbuName + '\'' +
                ", sbuHead='" + sbuHead + '\'' +
                "\nEmployee details:----------------\n" +
                empList;
    }
}
