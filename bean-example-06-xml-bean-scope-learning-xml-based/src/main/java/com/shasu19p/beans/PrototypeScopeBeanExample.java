package com.shasu19p.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

/**
 * Learning autowire in spring
 */
public class PrototypeScopeBeanExample {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("prototype-beans.xml");

		// first time bean
		Triangle tr1 = context.getBean("triangle", Triangle.class);
		System.out.println(tr1.draw());
		int tr1IdCode = System.identityHashCode(tr1);
		System.out.println(tr1IdCode);

		// Getting bean 2 time
		Triangle tr2 = context.getBean("triangle", Triangle.class);
		System.out.println(tr2.draw());
		int tr2IdCode = System.identityHashCode(tr2);
		System.out.println(tr2IdCode);

		Assert.isTrue(tr1IdCode != tr2IdCode, "prototype bean scope type should return new object all time");

	}
}
