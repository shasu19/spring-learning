package com.shasu19p.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean, DisposableBean {

	public String draw() {

		return "Drawing triangle";
	}

	@Override
	public void destroy() throws Exception {
		System.err.println("Bean triangle before destoy called here");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.err.println("Bean triangle after creation first called here");
	}
}