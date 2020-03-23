package com.shasu19p.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shasu19p.beans.Triangle;

public class BeanLifeCycleExample2 {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("bean-life-cycle-example01.xml");
		context.registerShutdownHook();

		// first time bean
		Triangle triangle = context.getBean("triangle", Triangle.class);
		System.out.println(triangle.draw());

		// This context is abstract application context
		// shutdown hook is added to jvm
		// so bean destroy method is called
		// and we can compare from example 1 and example 2 execution console result
	}
}
