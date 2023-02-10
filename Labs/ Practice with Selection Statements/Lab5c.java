
import java.util.Random;
import java.util.Scanner;

public class Lab5c {

	/**
	 * Manny Fomundam
	 * Lab 5c - Selection statements
	 * Using a random number generator to generate different fortunes
	 */
	
	public static void main(String[] args) {
		
		System.out.println("Roll for a random number");
		
		Random rnd = new Random();
		System.out.println(rnd.nextInt(9));
		int y = rnd.nextInt(9); 
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter in the random number selected ---> ");
		int x = in.nextInt();
		
			if (x >= 0 && x <= 2) {
				System.out.println("Beware the Ides of March");
			}
			
			else if (x >= 3 && x <= 4) {
				System.out.println("Watch your back");
			}
	
			else if(x == 5) {
				System.out.println("Don't talk to strangers");
			}
			
			else if (x == 6) {
				System.out.println("They're out to get you");
			}
			
			else{
				System.out.println("Have a nice day!");
			}		
	}
}
