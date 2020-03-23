package com.shasu19p.beans;

import org.springframework.beans.factory.BeanClassLoaderAware;

public class Square implements BeanClassLoaderAware {

	public String draw() {

		return "Drawing square";
	}


	@Override
	public void setBeanClassLoader(ClassLoader classLoader) {
		
		System.err.println("Classloader creating bean -----> Square");
	}
}
