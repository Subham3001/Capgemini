package com.EmployeeManagement.project;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("CIEmployee.xml");
		Employee emp = (Employee) context.getBean("emp");

		System.out.println(emp);
	}

}
