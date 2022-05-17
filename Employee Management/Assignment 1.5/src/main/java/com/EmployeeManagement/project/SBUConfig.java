package com.EmployeeManagement.project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class SBUConfig {
    @Bean()
    public Employee emp1(){
        return new Employee(12345,"Harriet",40000);
    }

    @Bean()
    public Employee emp2(){
        return new Employee(12346,"Kiran Rao",40000);
    }

    public List<Employee> getEmpList(){
        List<Employee> empList = new ArrayList<>();
        empList.add(emp1());
        empList.add(emp2());
        return empList;
    }

    @Bean(name = "sbu")
    public SBU getSBU(){
        return new SBU(1541,"Product Engineering Services","Kiran Rao",getEmpList());
    }
}
