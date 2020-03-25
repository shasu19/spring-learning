package com.shasu19p.beans;

import java.util.List;

public class Triangle {

	private List<Point> points;

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public String draw() {

		StringBuilder builder = new StringBuilder();
		for (Point p : points) {
			builder.append(p);
		}
		return builder.toString();
	}
}