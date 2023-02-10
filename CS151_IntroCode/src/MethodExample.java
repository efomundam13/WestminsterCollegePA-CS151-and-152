/*
 * MethodExample - simple program demonstrating
 * 					1) method call options
 * 					2) parameters
 * 					3) imprecision of floating point arithmetic
 * 
 * Author: John Bonomo
 */
public class MethodExample {

	public static void main(String [] args) {
		
		final int EXAMPLE_VALUE = 12;
		
		System.out.println("Method call example:");
		printSqrt(EXAMPLE_VALUE);
	}
	
	public static void printSqrt(int value)
	/*
	 * printSqrt(value) - outputs square root of value and the square of the square root
	 */
	{
									// calculate and output square root
		double sqrtValue = Math.sqrt(value);
		System.out.println("Square root of " + value + " = " + sqrtValue);
									// output sqaure root value squared
		System.out.println("Square root of " + value + " squared = " + sqrtValue*sqrtValue);
		
	}
	
/*
 * this short program shows three different way to call a method:
 * 
 * <object>.<method> - System.out.println()
 * <class>.<method>  - Math.sqrt(value)
 * <method>          - printSqrt(4)
 */
}
