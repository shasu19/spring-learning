package com.shasu19p.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Learning of bean initialization using xml based, with constructor.
 */
public class InnerBeansExample {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("inner-beans.xml");

		// Using inner beans
		Triangle tr = context.getBean("triangle2", Triangle.class);
		System.out.println(tr.draw());
		
		
		// alias in referring beans
		Triangle trTest = context.getBean("triangle2", Triangle.class);
		System.out.println(trTest.draw());
		
	}
}
