
import java.util.Scanner;

public class CircleDriver {

	 public static void main(String[] args) {
	    	Scanner in = new Scanner(System.in);
	    	
	    	System.out.print("Enter in the radius of a circle: ");
	    	
	    	Circle circle1 = new Circle(in.nextDouble());
	    	Circle circle2 = new Circle(in.nextDouble());
	   
	    	System.out.println("Area: " + circle1.findArea());
	    	System.out.println("Circumference:" + circle1.findCircumference());
	    	System.out.println("Diameter: " + circle1.findDiameter());
	    	System.out.println();
	    	System.out.println("Area: " + circle2.findArea());
	    	System.out.println("Circumference:" + circle2.findCircumference());
	    	System.out.println("Diameter: " + circle2.findDiameter());
	     	System.out.println();
	    	System.out.println(circle1.compareTo(circle2));
	     	System.out.println();
	    	System.out.println(circle1.isInside());
			 
		 }


	 }
	 
	