package com.shasu19p.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

/**
 * Learning autowire in spring
 */
public class BeanNametImplExmaple {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("bean-name-aware-beans.xml");

		// first time bean
		Circle circle = context.getBean("circle", Circle.class);
		System.out.println(circle.draw());

	}
}
