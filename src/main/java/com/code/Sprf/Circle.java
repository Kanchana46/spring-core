package com.code.Sprf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;

@Component
public class Circle implements Polygon {
	
	@Autowired
	Dimension dimension;
	
	private Point center;
	
	public Point getCenter() {
		return center;
	}

	//@Autowired
	//@Qualifier("cr")
	@Resource(name="q")
	public void setCenter(Point center) {
		this.center = center;
	}

	public void area() {
		System.out.println("Give area of the circle..");
		System.out.println(dimension);
	}
	
	public void draw() {
		System.out.println(getCenter().getX()+","+ getCenter().getY());
	}
}
