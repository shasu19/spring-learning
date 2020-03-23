package com.shasu19p.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Learning autowire in spring
 */
public class MapInBeanCreationExample2 {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("map-beans.xml");

		Circle tr = context.getBean("circle", Circle.class);
		System.out.println(tr.draw());
	}
}
