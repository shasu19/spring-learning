package com.shasu19p.beans;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware {

	ApplicationContext applicationContext;

	private Point pointA;
	private Point pointB;

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public String draw() {

		StringBuilder builder = new StringBuilder();
		builder.append(pointA);
		builder.append(pointB);
		return builder.toString();
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;

		// err for just differentiate from console logs
		System.err.println("We can leverage application context for getting new bean or many other purposes");
	}
}
