package org.akshay.demo;

import java.util.List;

public class Triangle {
	
	private String type;
	private List<Point> points;
	

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public void setType(String type) {
		this.type=type;
	}
	
	public String getType() {
		return type;
	}
	
	public void draw() {
		
		System.out.println("Drawing a Traingle of Type : " + type);
		for (Point point:points) {
			System.out.println("Point --> (" + point.getX() + "," + point.getY() + ")");
		}
		
	}

}
