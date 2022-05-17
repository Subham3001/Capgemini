package com.EmployeeManagement.project;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("CIEmployee.xml");
		SBU sbu = (SBU) context.getBean("sbu");

		Scanner sc = new Scanner(System.in);
		System.out.print("Employee ID : 	");
		int id = sc.nextInt();

		List<Employee> eList = sbu.empList()
			.stream()
			.filter(e -> e.employeeId() == id)
			.collect(Collectors.toList());

		eList.forEach(e -> System.out.print("Employee Info:\n" +
				"Employee ID          : " + e.employeeId() +
				"\nEmplpoyee NAME       : " + e.eeName() +
				"\nEmployee SALARY      : " + e.salary()));
	}

}
