package com.shasu19p.beans;

import org.springframework.beans.factory.BeanNameAware;

public class Circle implements BeanNameAware {

	public String draw() {

		return "Drawing Circle";
	}

	@Override
	public void setBeanName(String name) {

		// err to make red color visible on console
		System.err.println("Bean is being created with this name : " + name);

	}
}
