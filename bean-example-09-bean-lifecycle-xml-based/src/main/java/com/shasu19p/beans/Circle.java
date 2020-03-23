package com.shasu19p.beans;

public class Circle {

	public String draw() {

		return "Drawing circle";
	}

	public void myInit() throws Exception {
		System.err.println("Bean circle before destoy called here");
	}

	public void myAfterPropertiesSet() throws Exception {
		System.err.println("Bean circle after creation first called here");
	}
}