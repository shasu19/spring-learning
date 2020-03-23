package com.shasu19p.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shasu19p.beans.Employee;

public class ManagerDefaultProfileTester {

	public static void main(String[] args) {

		// System.setProperty("spring.profiles.active", "testing");
		System.out.println("***********");
		System.out.println(System.getProperty("spring.profiles.active"));

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans-profile*.xml");
		context.registerShutdownHook();

		// first time bean
		Employee employee = context.getBean("employee", Employee.class);
		employee.draw();

	}
}
