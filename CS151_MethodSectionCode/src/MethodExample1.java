import java.util.Random;
import java.util.Scanner;

/*
 * MethodExample1 - demonstrates the creation and use of a static method
 * 
 * Programmer: John Bonomo
 *       Date: 10/17/21
 */
public class MethodExample1 {

	public static void outputFortune()
	/*
	 * output a random fortune
	 */
	{
		Random rnd = new Random();
		switch (rnd.nextInt(10)) {
		case 0:
		case 1:
		case 2: System.out.println("Beware the Ides of March");
				break;
		case 3:
		case 4: System.out.println("Watch your back");
				break;
		case 5: 
		case 6: System.out.println("Don’t talk to strangers");
				break;
		case 7: 
		case 8: System.out.println("They’re out to get you");
				break;
		default: System.out.println("Today's a great day to be alive!");
		}
	}
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.print("Would you like a fortune? (y/n) --> ");
		String s = in.next().trim();
		if (s.toLowerCase().charAt(0) == 'y') {
			MethodExample1.outputFortune();
			System.out.println("Hope that helps");
		}
		else {
			System.out.println("Tough, you're getting one anyway!");
			MethodExample1.outputFortune();
		}

	}
}
