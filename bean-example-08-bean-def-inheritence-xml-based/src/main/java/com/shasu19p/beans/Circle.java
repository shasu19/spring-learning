package com.shasu19p.beans;

public class Circle {

	private Point pointA;
	private Point pointB;

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	
	public String draw() {

		return "Drawing Circle" + pointA + " " + pointB;
	}

}
