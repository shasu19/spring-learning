package com.shasu19p.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shasu19p.beans.Circle;

/**
 * Learning autowire in spring
 */
public class BeanDefInheritanceExample1 {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("bean-def-inheritence1.xml");

		// first time bean
		Circle circle = context.getBean("circle", Circle.class);
		System.out.println(circle.draw());

	}
}
