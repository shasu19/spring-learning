package com.shasu19p.beans;

import java.util.Map;
import java.util.Map.Entry;

public class Circle {

	private Map<String, Point> points;

	public void setPoints(Map<String, Point> points) {
		this.points = points;
	}

	public Map<String, Point> getPoints() {
		return points;
	}

	public String draw() {

		StringBuilder builder = new StringBuilder();
		for (Entry<String, Point> entry : points.entrySet()) {
			builder.append(
					entry.getKey() + " >> x:" + entry.getValue().getX() + ",y:" + entry.getValue().getY() + "\n");
		}

		return builder.toString();
	}
}
