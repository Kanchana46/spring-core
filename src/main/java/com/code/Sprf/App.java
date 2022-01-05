package com.code.Sprf;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main( String[] args ) {	
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//XML based configuration
	    //Polygon polygon = (Polygon)context.getBean("polygon");
	   // polygon.area();
	    
	    // Annotation based configuration
	    //Polygon polygon1 = (Polygon)context.getBean("triangle");
	   // polygon1.area();
	    
	    //Bean Property 
	    //Dimension dimension = (Dimension)context.getBean("dimension");
	    //System.out.println(dimension);
		 
		 Polygon polygon1 = (Polygon)context.getBean("circle");
		 polygon1.draw();
		
		 //Polygon polygon2 = (Polygon)context.getBean("triangle");
		// polygon2.draw();
	 }
}
