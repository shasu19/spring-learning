package com.shasu19p.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Learning autowire in spring
 */
public class ListInBeanCreationExample {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("list-beans.xml");

		Triangle tr = context.getBean("triangle", Triangle.class);
		System.out.println(tr.draw());
	}
}
