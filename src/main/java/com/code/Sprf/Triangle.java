package com.code.Sprf;
import org.springframework.stereotype.Component;

@Component
public class Triangle  implements Polygon {
	
	Point pA;
	Point pB;
	Point pC;
	
	public Point getpA() {
		return pA;
	}

	public void setpA(Point pA) {
		this.pA = pA;
	}

	public Point getpB() {
		return pB;
	}

	public void setpB(Point pB) {
		this.pB = pB;
	}

	public Point getpC() {
		return pC;
	}

	public void setpC(Point pC) {
		this.pC = pC;
	}

	public void area() {
		System.out.println("Give area of the triangle..");
	}
	
	public void draw() {
		System.out.println("pointA :"+ getpA().getX() + "," + getpA().getY());
		System.out.println("pointB :"+ getpB().getX() + "," + getpB().getY());
		System.out.println("pointC :"+ getpC().getX() + "," + getpC().getY());
	}

}
