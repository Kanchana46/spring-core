package com.code.Sprf;

import org.springframework.stereotype.Component;

//@Component
public class Dimension {
	
	//Constructor injection
	/*public Dimension(int heightOrRadius) {
		super();
		this.heightOrRadius = heightOrRadius;
	}*/

	public int heightOrRadius;

	public int getHeightOrRadius() {
		return heightOrRadius;
	}

	public void setHeightOrRadius(int heightOrRadius) {
		this.heightOrRadius = heightOrRadius;
	}

	@Override
	public String toString() {
		return "Dimension [heightOrRadius=" + heightOrRadius + "]";
	}
	
}
