
/**
 *  Programmer: Manny Fomundam
 *  	Date 10/18/21
 * Lab 6 - Loops: Using loops to figure out if a number is a prime number or not
 */

import java.util.Scanner;

public class Lab6 {

	public static void main(String[] args) {
		/*
		 * Output if a number is a prime number or not
		 */
		
		Scanner in = new Scanner(System.in); //here the program is asking for a number to be inputted into n
		
		char ans;					//variable used to re-run the loop
		
		do {
			int n;					// variables
			boolean isPrime; 
			do {
				System.out.println("Enter a value more than 1"); //If and else statements ro determine if its a prime number or not
				n = in.nextInt();	
				if (n < 2)
					isPrime = false;
				else if (n < 1)
					isPrime = false;
				else 
					isPrime = true;
				
				for (int i = 2; i <= n/i; i++) {
					if ((n % i) == 0) {
						isPrime = false;
						break;
					}
					}
				if (isPrime)																	//Outputs if a number is prime or not
					System.out.println(n + " is a prime number!");
				else if (n<=1)
					System.out.println(n + " is an invalid input, re-enter another input");
				else
					System.out.println(n + " is not a prime number");	
			} while(n<=1);
			System.out.println("Congrats on finding if a number is prime or not!");
				
			System.out.println("Do you have another number to check (y/n)? --- ");		//Asks to rerun the loop
			ans = in.next().toLowerCase().charAt(0);
			} while(ans == 'y');
		
		
		
		}
	
}
