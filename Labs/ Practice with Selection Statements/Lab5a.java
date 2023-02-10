
import java.util.Scanner;

/**
 * Manny Fomundam
 * Lab 5a - Selection statements
 * Using selection statements to get the contradictory statements of somethijng said
 */

public class Lab5a {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter in your sentence ---> ");
		String statement = in.nextLine();
		
		if (statement.equals("I love something")) {
			System.out.printf("No, you hate something");
		}
		else if (statement.equals("I like something")) {
			System.out.printf("No you hate something");
		}
		else if (statement.equals("I dislike something")) {
			System.out.printf("No, you like something");
		}
		else if (statement.equals("I hate something")) {
			System.out.printf("No, you love something");
		}
	}
}



