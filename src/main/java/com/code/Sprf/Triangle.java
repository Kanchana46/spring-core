package com.code.Sprf;
import org.springframework.stereotype.Component;

@Component
public class Triangle  implements Polygon{
	
	public void area() {
		System.out.println("Give area of the triangle..");
	}

}
