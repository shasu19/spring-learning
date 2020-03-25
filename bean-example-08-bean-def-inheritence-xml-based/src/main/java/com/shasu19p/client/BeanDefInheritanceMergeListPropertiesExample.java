package com.shasu19p.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shasu19p.beans.Triangle;

public class BeanDefInheritanceMergeListPropertiesExample {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("bean-def-list-merge-inheritence.xml");

		// first time bean
		Triangle circle = context.getBean("triangle", Triangle.class);
		System.out.println(circle.draw());

	}
}
