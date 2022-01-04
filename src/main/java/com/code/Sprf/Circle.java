package com.code.Sprf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Polygon {
	
	@Autowired
	Dimension dimension;
	
	public void area() {
		System.out.println("Give area of the circle..");
		System.out.println(dimension);
	}
}
