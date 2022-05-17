package com.EmployeeManagement.project;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("CIEmployee.xml");
		SBU sbu = (SBU) context.getBean("sbu");

		System.out.println(sbu);
	}

}
