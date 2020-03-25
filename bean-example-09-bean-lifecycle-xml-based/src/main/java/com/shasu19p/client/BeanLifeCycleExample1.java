package com.shasu19p.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shasu19p.beans.Triangle;

public class BeanLifeCycleExample1 {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("bean-life-cycle-example01.xml");

		// first time bean
		Triangle triangle = context.getBean("triangle", Triangle.class);
		System.out.println(triangle.draw());

		// This context is not abstract application context
		// shutdown hook is not added to jvm
		// so bean destroy method is not called
	}
}
