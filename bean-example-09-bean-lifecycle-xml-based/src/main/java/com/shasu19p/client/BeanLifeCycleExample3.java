package com.shasu19p.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shasu19p.beans.Circle;

// Consider, we have .class and we can not modify
// we want to create bean
// and we want bean life cycle to manage
// then we can leverage spring's xml based style
public class BeanLifeCycleExample3 {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("bean-life-cycle-example3.xml");
		context.registerShutdownHook();

		// first time bean
		Circle circle = context.getBean("circle", Circle.class);
		System.out.println(circle.draw());

		// This context is abstract application context
		// shutdown hook is added to jvm
		// so bean destroy method is called
		// and we can compare from example 1 and example 2 execution console result
	}
}
