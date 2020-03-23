package com.shasu19p.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Learning of bean initialization using xml based, with constructor. Bean
 * property updating with idref
 */
public class IdRefExampleClient {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("id-ref-beans.xml");

		// Using id ref beans example
		Triangle tr = context.getBean("triangleRefTry", Triangle.class);
		System.out.println(tr.draw());

	}
}
