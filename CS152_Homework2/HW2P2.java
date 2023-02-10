
/**Programmer: Manny Fomundam
	 * Homework 2: Problem 2a, 2b and 2c
	 * Date: 2/14/2022
	 * 5a.) Write an interface Shape which contains two methods: double area() and double
perimeter() which calculate and return (NOT print) the area and perimeter of a geo-
metric shape.
	 * 5b.) Write classes Circle, Rectangle and Triangle which implement the Shape interface
	 * 5c.) Write a method Rectangle boundingBox() for each of the three classes above
which returns the appropriate bounding box
	 **/
public class HW2P2 {
	
	interface Shape {				//Interface
		double area();
		double perimeter();
		}
	
	class Circle implements Shape {			//Circle

		double x;
		double y;
		private final double PI = 3.14159;
		private double radius;

		public Circle(double x, double y, double r) {
			this.x = x;
			this.y = y;
			radius = 0;
		}

		public Circle(double r) { 			//gets the radius and sets the radius
			radius = r;
		}
		
		public void setRadius(double r) {
			radius = r;
		}
		
		public double getRadius() {
			return radius;
		}
		@Override
		public double area() {				//calculating the area
	        return PI * radius * radius;
	    }

		@Override
		public double perimeter() {			//calculating the perimeter
			 return 2 * PI * radius;
		} 
		
	
		
	class Rectangle implements Shape {

		private int x1, x2, y1, y2;
		private int base = 0, height = 0;
		
		public Rectangle(int x1, int y1, int x2, int y2) {		//rectangle
			this.x1 = x1;
			this.x2 = x2;
			this.y1 = y1;
			this.y2 = y2;
		}
		
		public void setBase(int x1, int x2) {		//gets and sets base
			base = Math.abs(x2-x1);
		}
		
		public double getBase() {
			return base;
		}
		
		public void setHeight(int y1, int y2) {			//gets and sets height
			height = Math.abs(y2-y1);
		}
		
		public double getHeight() {
			return height;
		} 
		
		@Override
		public double area() {			//calculates the area
			return base * height;
		}

		@Override
		public double perimeter() {			//calculates perimeter
			return 2 * (base + height);
		}
		
	class Triangle implements Shape {

		private int x1, x2, y1, y2, x3, y3;
	
		private int lengthA = 0, lengthB = 0, lengthC = 0;
		
		public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
			this.x1 = x1;
			this.x2 = x2;
			this.y1 = y1;
			this.y2 = y2;
			this.x3 = x3;
			this.y3 = y3;
		}

		public void setLengthA(int x1, int x3) {		//sets and gets one of the sides
			lengthA += Math.abs(x3-x1);
		}
		
		public double geLengthA() {
			return lengthA;
		}
		
		public void setLengthB(int x1, int x2, int y1, int y2) {			//sets and gets another one of the sides
			lengthB = (int) Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		}
		
		public double geLengthB() {
			return lengthB;
		}
		
		public void setLengthC(int x1, int x3, int y1, int y3) {			////sets and gets the last of the sides
			lengthC = (int) Math.sqrt((x3-x1)*(x3-x1) + (y3-y1)*(y3-y1));
		}
		
		public double geLengthC() {
			return lengthC;
		}
		@Override
		public double area() {											//calculates arew
			int s = (lengthA + lengthB + lengthC) / 2;
			return Math.sqrt(s*(s-lengthA)*(s-lengthB)*(s-lengthC));
		}

		@Override
		public double perimeter() {						//calculates circumference
			return lengthA + lengthB + lengthC;
		}
		
	
		public static void main(String [] args) {														//main program
		 // circle with center (1.2, 3.4) and radius 5
		; // rectangle with lower, left corner at (0,0)
													// and upper right at (10,5)
		 // triangle with vertices (0,0), (0,5) and (6,0)
		System.out.println(); // should output 15.0
		System.out.println(); // should output 31.4156
		}
	}
	}
	}
}
