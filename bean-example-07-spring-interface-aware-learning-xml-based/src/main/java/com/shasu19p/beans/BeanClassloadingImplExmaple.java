package com.shasu19p.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanClassloadingImplExmaple {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("classloader-aware-beans.xml");

		// first time bean
		Square square = context.getBean("square", Square.class);
		System.out.println(square.draw());

	}
}
