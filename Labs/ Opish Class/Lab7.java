import java.util.Scanner;

/**
 *  Programmer: Manny Fomundam
 *  	Date 10/31/2021
 * Lab 7 - Opish; translating english into opish
 */
public class Lab7 {
												//runs the code from the class opish
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Opish opObj = new Opish();
		
		System.out.println("Enter a phrase to traslate (type END to stop)");
		String s = in.nextLine();
		while (!s.equals("END")) {
			opObj.setPhrase(s);
			System.out.println(opObj.getOpish(s));
			System.out.println("\nEnter another phrase (END to stop)");
			s = in.nextLine();
		}
	}
	}