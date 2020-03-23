package com.shasu19p.beans;

public class Triangle {

	private Point pointA;
	private Point pointB;
	private Point pointC;

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public String draw() {

		StringBuilder builder = new StringBuilder();
		builder.append(pointA);
		builder.append(pointB);
		builder.append(pointC);

		return builder.toString();
	}
}
