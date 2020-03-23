package com.shasu19p.beans;

public class Triangle {

	private Point pointA;
	private Point pointB;
	private Point pointC;

	public Triangle(Point pointA, Point pointB, Point pointC) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
	}

	public Triangle() {
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public String draw() {

		StringBuilder builder = new StringBuilder();
		builder.append(pointA);
		builder.append(pointB);
		builder.append(pointC);

		return builder.toString();
	}
}
