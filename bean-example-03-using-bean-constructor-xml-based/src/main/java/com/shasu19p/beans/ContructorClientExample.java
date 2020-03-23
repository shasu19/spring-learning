package com.shasu19p.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Learning of bean initialization using xml based, with constructor.
 */
public class ContructorClientExample {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Triangle tr = context.getBean("triangle", Triangle.class);
		System.out.println(tr.draw());
	}
}
