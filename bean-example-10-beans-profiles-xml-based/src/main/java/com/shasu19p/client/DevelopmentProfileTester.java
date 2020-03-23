package com.shasu19p.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shasu19p.beans.Employee;

public class DevelopmentProfileTester {

	// Pass the profile details 'spring.profiles.active=testing' from environment
	// variable
	// program arguments -args
	// vm arguments - -vm
	// system properties -D arguments
	public static void main(String[] args) {

		System.out.println("**********");
		System.out.println(System.getProperty("spring.profile.active"));
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans-profile*.xml");
		context.registerShutdownHook();

		// first time bean
		Employee employee = context.getBean("employee", Employee.class);
		employee.draw();
	}
}
